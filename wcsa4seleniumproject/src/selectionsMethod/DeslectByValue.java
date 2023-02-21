package selectionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeslectByValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/Anisha/OneDrive/Documents/MultiDropdown.html");
		WebElement dropdowElement = driver.findElement(By.id("menu"));
	
	Select sel = new Select(dropdowElement);
	for(int i=0;i<9;i++)
	{
		sel.selectByIndex(i);
		Thread.sleep(3000);
	}
	sel.deselectByValue("v5");
	}
}
