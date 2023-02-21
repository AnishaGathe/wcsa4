package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpageActitime {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://laptop-tu5dt8fp/login.do");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='c']")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	}

}
