package HandledDisabledElement;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollup {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chromedriver.driver","./drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.selenium.dev/downloads/");
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		ex.executeScript("window.scrollBy(0,4500)");

}
}
