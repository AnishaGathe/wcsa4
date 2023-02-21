package popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameByIndex {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chromedriver.exe","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/Anisha/OneDrive/Documents/frame.html");
		driver.switchTo().frame(0);
		WebElement usn = driver.findElement(By.id("i2"));
		usn.sendKeys("Admin");
	WebElement password = driver.findElement(By.id("id1"));
	password.sendKeys("manager");
	
	

}
}
