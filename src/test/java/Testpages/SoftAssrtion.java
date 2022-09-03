package Testpages;

import org.testng.Assert;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssrtion {
//	@Test
//	public	void	test1()
//	{
//	SoftAssert	s=new SoftAssert();
//	int i1=200;
//	int i2=201;
//	String s1="Java";
//	String s2="Java";
//	System.out.println("Execution	of	test1	started");
//	Assert.assertEquals(i1,i2,"Check	if	it	failed");
//	System.out.println("Checking first	assertion");
//	AssertJUnit.assertEquals(s1,s2,"Check	if	it	failed");
//	System.out.println("Execution	of	test1	ended");
////	s.assertAll();
//	}
	@Test
	public	void softAssert()
	{
		SoftAssert soft=new SoftAssert();
		String s1="abc";
		String s2="pqr";
		soft.assertEquals(s1,s2,"Failed1:Both results are different");
		System.out.println("Test case failed");
//		String s3="Velocity";
//		String s4="Velocity";
//		soft.assertNotEquals(s3,s4,"Failed2:Both results are same");
//		
//		boolean s5=true;
//		soft.assertTrue(s5);
		soft.assertAll();
	}
	
}

//	@Test
//	public	void test2()
//	{
//	System.out.println("Execution	of	test2	started");
//	Assert.assertEquals(200,201,"Check	if	it	failed");
//	System.out.println("Checking first assertion");
//	AssertJUnit.assertEquals("Java","Java","Check	if	it	failed");
//	System.out.println("Execution	of	test2	ended");
//	}
//	}

