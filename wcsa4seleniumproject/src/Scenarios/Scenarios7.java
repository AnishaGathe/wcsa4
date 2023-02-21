package Scenarios;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Scenarios7 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chromedriver.exe","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//a[.='All Jewellery ']")).click();
		driver.findElement(By.xpath("//span[.='Kadas']")).click();
		driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='Submit' and(@id='buy-now')]")).click();
		ChromeDriver cd=(ChromeDriver)driver;
		File src = cd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/screenshot1.jpg");
		Files.copy(src, dest);
		
		
		
	}	

}
