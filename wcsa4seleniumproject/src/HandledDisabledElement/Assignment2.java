package HandledDisabledElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/downloads/");
		WebElement download = driver.findElement(By.xpath("//p[.='Ruby']"));
		Point loc = download.getLocation();
		int xaxis=loc.getX();
		int yaxis=loc.getY();
		System.out.println(xaxis+":is the Xaxis"+yaxis+"is the Yaxis");
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		
		ex.executeScript("window.scrollBy("+xaxis+","+(yaxis-200)+")");
		Thread.sleep(4000);
	}
}
