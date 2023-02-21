package TestNg1;

import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.Reporter;


public class Flag7 {
  @Test
  public void m1() {
	  Assert.fail();
	  Reporter.log("m1 method",true);
  }
  
  @Test(dependsOnMethods = "m1",alwaysRun = true)
  public void m2()
  {
	  Reporter.log("m2 method",true);
  }
}

