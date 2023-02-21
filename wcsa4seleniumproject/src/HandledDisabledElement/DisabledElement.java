package HandledDisabledElement;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/Anisha/OneDrive/Documents/disabled.html");
		JavascriptExecutor ex=(JavascriptExecutor )driver;
		Thread.sleep(2000);
		ex.executeScript("document.getElementById('i2').value='manager'");
		
	}
	

}
