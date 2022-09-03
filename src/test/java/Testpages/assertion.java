package Testpages;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertion {

//	@Test
//	public void assertEquals()
//	{
//		String actResult="Velocity";
//		String expResult="Velocty";
//		String FailedResult2="City";
		//Assert.assertEquals(actResult, expResult,"Failed:Both result are different");
		
		//Assert.assertEquals(actResult, FailedResult2,"Failed:Both result are different");
		
		//Assert.assertNotEquals(actResult,expResult,"Failed:Both result are equal");
	
	@Test
	
//	public void AssertTrue()
//	{
//		boolean actResult=true;
//		Assert.assertTrue(actResult);
//		
//	}
//	public void AssertFalse()
//	{
//		boolean actResult=false;
//		Assert.assertFalse(actResult);
//	}
//	}
	
//	public void AssertNull()
//	{
//		String actResult="Automation";
//		Assert.assertNull(actResult);
//	}
	
	public void AssertNotNull()
	{
		String actResult="Automation";
		Assert.assertNotNull(actResult);
	}
}
