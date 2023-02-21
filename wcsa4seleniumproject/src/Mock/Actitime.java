package Mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://laptop-tu5dt8fp/login.do");
		WebElement UsernameTextBox=driver.findElement(By.xpath("//input[@name='username']"));
		UsernameTextBox.sendKeys("admin");
		boolean status = UsernameTextBox.isDisplayed();
		System.out.println(status);
		WebElement PasswordTextBox=driver.findElement(By.xpath("//input[@name='pwd']"));
		PasswordTextBox.sendKeys("manager");
		boolean status2 = PasswordTextBox.isDisplayed();
		System.out.println(status2);
		Thread.sleep(4000);
		UsernameTextBox.clear();
		PasswordTextBox.clear();
		
		
		
	}

}
