package genericPackage;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WorkLibrary extends BaseTest{
	
	public void handlebyIndex(int Index)
	{
		driver.switchTo().frame(Index);
	}	
	public void handlebyIndex(WebElement frameElement)
	{
		driver.switchTo().frame(frameElement);
	}	
	public void handlebyNameorId(String Name)
	{
		driver.switchTo().frame(Name);
	}	
	public void RightClick(WebElement target)
	{
	Action act = new Actions(drivers);
	act.con
	}
		


}
