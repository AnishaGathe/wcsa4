package TestNg1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Actitime2 {
  static WebDriver driver;
		  @Test(enabled = true)
		  public void manual() {
			  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			  driver.get("http://laptop-tu5dt8fp/login.do");
			  //driver.switchTo().activeElement().sendKeys("SQL");
			  Reporter.log("Actitime1",true);
		  }
		}
  

