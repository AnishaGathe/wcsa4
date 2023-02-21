package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartsynchronization1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	   driver.get("https://www.flipkart.com/search");
	   driver.findElement(By.xpath("//buttom[.='X')")).click();
	   driver.findElement(By.xpath("//span[.='Cart']")).click();
	   driver.findElement(By.xpath("//button[.='Login']")).click();
	   
	   
	   
		
		
		
	}

}
