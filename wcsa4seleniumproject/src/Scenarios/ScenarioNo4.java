package Scenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScenarioNo4 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//Input[@class='gh-tb ui-autocomplete-input']")).sendKeys("AppleWatches");
		
		WebElement dropDownElement = driver.findElement(By.xpath("//select[@class='gh-sb ']"));
		
		Select sel = new Select(dropDownElement);
		sel.selectByVisibleText(" Jewelry & Watches");
		
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		String priceOfWatch = driver.findElement(By.xpath("//span[.='Nylon Band Trail Loop For Apple Watch Ultra 38-49mm iWatch Series 8 7 6 SE 5 4']/ancestor::div[@class='s-item__info clearfix']/descendant::span[@class='s-item__price']")).getText();
		System.out.println(priceOfWatch+":is the price of Watch");
		
		Robot robot=new Robot();
		for(int i=0;i<11;i++)
		{
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
		
		
		

		
	}


