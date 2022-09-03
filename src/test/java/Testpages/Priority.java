package Testpages;

import org.testng.Reporter;

import org.testng.annotations.Test;

public class Priority {
@Test(priority=2)
public void TC1()
{
	Reporter.log("Running TC1",true);
}
@Test(priority=1)
public void TC2()
{
	Reporter.log("Running TC2",true);
}
@Test
public void TC3()
{
	Reporter.log("Running TC3",true);
}
@Test(priority=-7)
public void TC4()
{
	Reporter.log("Running TC4",true);
}
@Test(priority=-3)
public void TC5()
{
	Reporter.log("Running TC5",true);
}
}
