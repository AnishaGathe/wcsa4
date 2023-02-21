package methodsofwebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlocationmethod {
	private static final String Xaxis = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/downloads/");
		WebElement download = driver.findElement(By.xpath("//h1[.='Downloads']"));
		Point loc = download.getLocation();
		int xaxis=loc.getX();
		int yaxis=loc.getY();
		System.out.println(Xaxis+":is the Xaxis"+yaxis+"is the Yaxis");
	}

}
