package TestNgParallel;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag7 {
  @Test
	  public void demo() {
		  Reporter.log("demo",true);
		  Assert.fail();
		  
	  }
	@Test(dependsOnMethods ="demo")

		public void demo1() {
			Reporter.log("demo1",true);
		}
	
  }


