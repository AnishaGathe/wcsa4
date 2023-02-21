package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSynchronization {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://laptop-tu5dt8fp/login.do");
		String actualLoginPageTitle=driver.getTitle();
		if(actualLoginPageTitle.equals("actiTIME - Login"))
		{
			System.out.println("Login page title is match:Test case is passed");
		}
		else
		{
			System.out.println("Login page title is not match:Test case is failed");
		}
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	  driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	  Thread.sleep(4000);
	  String actualHomePageTitle =driver.getTitle();
	  if(actualHomePageTitle.equals("actiTIME - Enter Time-Track"))
	  {
		  System.out.println("Home page title is match:Test case is passed");
	  }
	   else
	  {
		  System.out.println("Home page title is match:Test case is failed");
	  }
		
	}

}
