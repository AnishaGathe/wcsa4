package KeywordDriverFramework;


	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class ActitimeLoginInvalidData extends BaseTest {
		
		public static void main(String[] args) throws IOException {
		   
			BaseTest bt = new BaseTest();
			bt.openBrowser();
			
			Flib flib = new Flib();
			int rc=flib.rowCount(EXCEL_PATH,"invalidcreads");
			for(int i=1;i<=rc;i++)
			{

			String username = flib.readPropertyData(PROP_PATH,"Username");
			String password = flib.readPropertyData(PROP_PATH,"Password");
			
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			
			driver.findElement(By.id("loginButton")).click();
			bt.closeBrowser();
		}
		

	}
	}

