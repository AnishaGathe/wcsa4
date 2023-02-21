package methodsofwebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/downloads/");
		WebElement download = driver.findElement(By.xpath("//h1[.='Downloads']"));
		Rectangle Rect = download.getRect();
		int Xaxis=Rect.getX();
		int Yaxis=Rect.getY();
		int height = Rect.getHeight();
		int width = Rect.getWidth();
		System.out.println(Xaxis);
		System.out.println(Yaxis);
		System.out.println(height);
		System.out.println(width);
	}
	

}
