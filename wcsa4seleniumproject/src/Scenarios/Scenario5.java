package Scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scenario5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.exe","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
	WebElement target = driver.findElement(By.xpath("//a[.='Rings ']"));
		 Actions act=new Actions(driver);
		    
		    act.moveToElement(target).perform();
			Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@title='Diamond Rings'])[1]")).click();
		driver.findElement(By.xpath("//div[.='Sort by']")).click();
	   WebElement dropdownElement = driver.findElement(By.xpath("//a[.='Price Low to High ']"));
	   Select sel = new Select(dropdownElement);
		Thread.sleep(4000);
		sel.selectByIndex(2);
		
	    
	  
		driver.findElement(By.xpath("//span[.='Price']")).click();
		driver.close();

	    
		
	}

}
