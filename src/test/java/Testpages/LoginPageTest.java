package Testpages;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.Testbase;
import Pages.LoginPage;
import Utility.CaptureScreenshot;

public class LoginPageTest extends Testbase{
LoginPage Login;
@BeforeMethod(groups="Sanity")
public void setup() throws Throwable 
{
	initialization();
	Login=new LoginPage();
}

@Test(groups="Sanity")
public void LoginZerodhaAppTest() throws Throwable 
{
	Login.LoginZerodhaApp();
}
@Test(timeOut=100)
public void verifyKiteLogoTest()
{
	
	boolean actTitle=Login.verifyKiteLogo();
	System.out.println(actTitle);
	Assert.assertTrue(false);
}
@Test(dependsOnMethods="verifyKiteLogoTest")
public void verifyTitleTest() 
{
	
	String actTitle=Login.verifyAppTitle();
	String expTitle="1KiteZerodha's fast and elegant flagship  platform";
	Assert.assertEquals(actTitle,expTitle,"Title is wrong");
	//System.out.println(actTitle);
	driver.close();
}
@Test
public void verifyKiteLableTest()
{
	String actLabel=Login.verifyKiteLabel();
	System.out.println(actLabel);
}


@AfterMethod
public void Exit(ITestResult res) throws Exception
{
	if(ITestResult.SUCCESS==res.getStatus())
	{
		CaptureScreenshot.screenCapture(driver,res.getName());
	}
	else
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			CaptureScreenshot.screenCapture(driver,res.getName());
		}
	}
	driver.close();
}
}
//public void verifyKiteAndroidAppTest()
//{
//	boolean res1=Login.verifyKiteAndroidApp();
//	System.out.println(res1);
//}
//public void verifyPlaystoreAppTest()
//{
//	boolean res2=Login.verifyPlaystoreApp();
//	System.out.println(res2);
//}


