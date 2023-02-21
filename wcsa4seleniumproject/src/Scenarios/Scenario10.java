package Scenarios;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario10 {public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chromedriver.exe","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.xpath("//span[.='Allow']")).click();
	driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
	driver.close();
}
	

}
