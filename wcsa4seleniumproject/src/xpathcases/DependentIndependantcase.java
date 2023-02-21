package xpathcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentIndependantcase {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrime.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung mobiles");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
        String priceOfMobile = driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F13 (Nightsky Green, 64 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
        Thread.sleep(2000);

        System.out.println(priceOfMobile+":is the price of Mobile");
       driver.quit();
		
	}

}
