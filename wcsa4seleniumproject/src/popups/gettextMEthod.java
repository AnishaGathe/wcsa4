package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettextMEthod {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("file:///C:/Users/Anisha/OneDrive/Documents/popup.html");
			WebElement button = driver.findElement(By.xpath("//button[.='Click me! ']"));
			button.click();
			
		Alert al=driver.switchTo().alert();
		Thread.sleep(3000);
		String textOfAlert = al.getText();
		System.out.println(textOfAlert);


}
	}
