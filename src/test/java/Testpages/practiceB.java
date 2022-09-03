package Testpages;



import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class practiceB {

	public void TC0() 
	{
		System.out.println("Running test case 0");
	}
	@Test
	public void TC1()
	{
		Reporter.log("Running test case 1",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("Running test 2",false);
	}
	@Test 
	public void TC3()
	{
		Reporter.log("Running test 3",true);
	}
	
}