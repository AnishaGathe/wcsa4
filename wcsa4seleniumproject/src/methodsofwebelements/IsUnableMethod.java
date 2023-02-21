package methodsofwebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsUnableMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Anisha");
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys("12345");
		WebElement loginbutton = driver.findElement(By.xpath("//button[@class='_acan _aiit _acap _aijb _acas _aj1-']"));
		boolean status =  loginbutton.isEnabled();
		System.out.println(status);
	}
}
		

