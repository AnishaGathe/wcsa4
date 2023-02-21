package TakesScreenshot1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TakeScreenshotMethod2 {	
	public static void main(String[] args) throws IOException {

System.setProperty("webdriver.chrome.exe", "./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
RemoteWebDriver rwd = (RemoteWebDriver)driver;

 rwd.manage().window().maximize();
 rwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
rwd.get("https://www.selenium.dev/downloads/");
File src = rwd.getScreenshotAs(OutputType.FILE);
File dest = new File("./screenshots/screenshot2.jpg");

}
}