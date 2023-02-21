package selectionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://laptop-tu5dt8fp/login.do");
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	WebElement dropDownElement = driver.findElement(By.xpath("//select[@name='usersSelector.selectedUser']"));
	Select sel = new Select(dropDownElement);
	Thread.sleep(4000);
	sel.selectByIndex(3);
	
		
		
	}

}
