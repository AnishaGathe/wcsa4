package robotClassMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignmentBluestone {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("confirmBtn")).click();
		WebElement jwl = driver.findElement(By.xpath("//a[.='Watch Jewellery ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(jwl).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Band']")).click();
		Robot rbt = new Robot();
	WebElement ClickAndHold = driver.findElement(By.xpath("(//div[@class='opt-title'])[1]"));
	for(int i=0;i<=0;i++)
	{
		act.clickAndHold(ClickAndHold).perform();
		Thread.sleep(2000);
	}
	rbt.keyPress(KeyEvent.VK_CONTROL);
	rbt.keyRelease(KeyEvent.VK_C);
	Thread.sleep(2000);
	rbt.keyPress(KeyEvent.VK_CONTROL);
	rbt.keyRelease(KeyEvent.VK_C);
	driver.findElement(By.xpath(""));
	
		
		
		
		
}
}
