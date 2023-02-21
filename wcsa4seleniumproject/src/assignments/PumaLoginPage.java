package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PumaLoginPage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en/account/login");
		driver.findElement(By.xpath("//buttom[.='X')")).click();
		driver.findElement(By.xpath("//input[@name='phoneNo']")).sendKeys("7058978");
		driver.findElement(By.xpath("//div[contains(text(),'Get OTP')]")).click();
	}

}
