package selectionsMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionMethod3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/Anisha/OneDrive/Documents/MultiDropdown.html");
	    WebElement dropDownElement = driver.findElement(By.xpath("//select[@name='Menu']"));
	    Select sel=new Select(dropDownElement);
	    List<WebElement> alloptions = sel.getOptions();
	    for(WebElement opts:alloptions)
		   {
			 if(opts.getText().equals("chakali"))
			 {
				 opts.click();
				 break ;
			 }
	    
	    

	}
	}
}
	    
	    
