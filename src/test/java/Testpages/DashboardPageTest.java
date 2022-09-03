package Testpages;

import org.testng.annotations.Test;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Testbase;
import Pages.DashboardPage;
import Pages.LoginPage;

public class DashboardPageTest extends Testbase  {
DashboardPage dash;
LoginPage login;

@BeforeMethod(groups="Regression")

public void setup() throws Throwable 
{
	initialization();
	login=new LoginPage();
	dash=new DashboardPage();
	Thread.sleep(2000);
	login.LoginZerodhaApp();
	
	
}
@Test(groups="Regression")
public void verifynicknameTest() 
{
	String value=dash.verifynickname();
	System.out.println(value);
}
@Test(groups="Sanity")
public void verifyuseridLabelTest() 
{
	String value1=dash.verifyuseridLabel();
	System.out.println(value1);
}
@Test(groups="Regression")
public void verifyEmailIdLabel1Test() 
{
	dash.useridClick();
	String value2=dash.verifyEmailIdLabel1();
	System.out.println(value2);
	}
@AfterMethod(groups="Regression")
public void Exit()
{
	driver.close();
}
}

