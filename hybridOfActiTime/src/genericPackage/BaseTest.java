package genericPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.google.common.io.Files;

public class BaseTest implements lAutoconstant{
	protected static WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String browservalue = flib.readPropertyData(PROP_PATH, "Browser");
		String url = flib.readPropertyData(PROP_PATH, "url");
		if(browservalue.equals("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url);
			
		}
		else if(browservalue.equals("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url);
			
		}
		else
		{
			Reporter.log("enter correct Browser!!,true");
		}
		
	}
	public void failed(String methodName)
	{
		try
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots"+methodName+".png");
			Files.copy(src, dest);
					
		}
		catch(Exception e)
		{
			
		}
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	@BeforeTest
	public void chromeProperty()
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		
	}
	public void firefoxproperty()
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
	}
	

}
