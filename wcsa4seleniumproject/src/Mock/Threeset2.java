package Mock;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Threeset2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.exe", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/Anisha/OneDrive/Documents/MultiDropdown.html");
		   WebElement dropdownElement = driver.findElement(By.id("menu"));
		    Select sel = new Select(dropdownElement);
		    List<WebElement> allOptions = sel.getOptions();
	       TreeSet<String> t= new TreeSet<String>();
	       
	        for(int i=0;i<allOptions.size();i++)
	       {
		     WebElement opts = allOptions.get(i);
	         String values = opts.getText();
	         t.add(values);
	       }
	        for(String options:t)
	        {
	        	System.out.println(options);
	        }
		}
}
	
	


