package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceofLaptops {
	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[.='✕']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hp Laptop");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[.='Core i7']/preceding-sibling::div[@class='_24_Dny']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[.='Brand' and(@class='_2gmUFU _3V8rao')]")).click();

			driver.findElement(By.xpath("//div[.='HP']/preceding-sibling::div[@class='_24_Dny']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[.='Operating System' and(@class='_2gmUFU _3V8rao')]")).click();
			driver.findElement(By.xpath("//div[.='Windows 10']/preceding-sibling::div[@class='_24_Dny']")).click();
			Thread.sleep(2000);

			
			driver.findElement(By.xpath("//div[.='4★ & above']/preceding-sibling::div[@class='_24_Dny']")).click();
			Thread.sleep(2000);
		
			String priceoflaptop = driver.findElement(By.xpath("//div[.='HP Pavilion Gaming Core i7 11th Gen - (16 GB/512 GB SSD/Windows 10 Home/4 GB Graphics/NVIDIA GeForce G...']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
			System.out.println(priceoflaptop+":price of laptop");
		}
		}
		
	


