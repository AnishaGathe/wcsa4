package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidcreads {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://laptop-tu5dt8fp/login.do");
		Flib2 flib = new Flib2();
		int rc = flib.rowCount("./data/lnvalid creads.xlsx", "InvalidCreads");

	
		for(int i=1;i<=rc;i++)
		{
		String usn = flib.readExcelData("./data/lnvalid creads.xlsx", "InvalidCreads", i, 0);
		String pass = flib.readExcelData("./data/lnvalid creads.xlsx", "InvalidCreads", i, 1);
		WebElement username1= driver.findElement(By.name("username"));
		username1.sendKeys(usn);
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		 driver.findElement(By.name("username")).clear();
		
		
		
		
		
				
		
	}
	
}
}
