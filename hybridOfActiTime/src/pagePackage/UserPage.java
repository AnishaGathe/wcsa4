package pagePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage {
	@FindBy(xpath="//div[@class='label'and(.='Users')]")private WebElement usertab;
    @FindBy(xpath="//input[@type='button'and(@value='Create New User')]")private WebElement createnewUser;
	@FindBy(name="username")private WebElement username;
	@FindBy(name="passwordText")private WebElement password;
    @FindBy(name="passwordTextRetype")private WebElement retypepassword;
	@FindBy(name="firstName") private WebElement FirstName;

	@FindBy(name="lastName")private WebElement LastName;
	@FindBy(xpath="//input[@type='submit'and(.='')]")private WebElement button;
	@FindBy(xpath="//input[@type='button'and(@value='      Cancel      ')]")private WebElement CancelButton;
}
//initilization

//Operational Methods



