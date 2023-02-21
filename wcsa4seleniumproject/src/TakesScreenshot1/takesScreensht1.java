package TakesScreenshot1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takesScreensht1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.exe", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.selenium.dev/downloads/");
	File src = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshots/screenshot1.jpg");
	Files.copy(src, dest);
	
	}

}
