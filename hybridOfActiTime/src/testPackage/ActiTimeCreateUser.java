package testPackage;

import org.testng.annotations.Test;

import genericPackage.Flib;\
import pagePackage.LoginPage;

public class ActiTimeCreateUser {
	@Test
	public void createValidUser()
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.actiTimeInvalidLogin(flib.readPropertyData(PROP_PATH, "username"), null);
	}

}
