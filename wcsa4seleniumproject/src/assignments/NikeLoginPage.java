package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NikeLoginPage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/in/member/profile/login?continueUrl=https://www.nike.com/in/");
		driver.findElement(By.xpath("//input[@id='8584ee01-ebdc-4746-86de-302113e3e781']")).sendKeys("anisha");
		driver.findElement(By.xpath("//input[@id='007437b7-6f44-44e7-8a93-c7cca3a9507f']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@id='e4f5ceb7-4a4a-483d-beec-5aa50a506bba']")).click();
		
	}

}
