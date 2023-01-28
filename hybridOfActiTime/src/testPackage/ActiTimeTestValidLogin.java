package testPackage;

import org.junit.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;

public class ActiTimeTestValidLogin extends BaseTest{
	
	@Test
	public void validTest()
	{
		Flib flib = new Flib();
		LoginPage Ip = new LoginPage(driver);
		Ip.actiTimeInvalidLogin(flib.readExcelData(PROP_PATH, "UserName", flib.readPropertyData(PROP_PATH, "Password")), null;
	}

}
