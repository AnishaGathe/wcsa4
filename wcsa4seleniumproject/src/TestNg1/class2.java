package TestNg1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class2 {
	static WebDriver driver;
  @Test(enabled = true)
  public void Java() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  driver.get("https://www.google.com");
	  driver.switchTo().activeElement().sendKeys("Java");
	  
  }
}
