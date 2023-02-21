package methodsofwebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlebyswitchtoMethod {
	//how to close parent&child without using quit
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']"));
	Set<String> window = driver.getWindowHandles();
	  for(String opts:window)
	  {
		  driver.switchTo().window(opts).close();
		  }
	  }

}
