package Testpages;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {
@BeforeClass
public void OpenBrowser()
{
	Reporter.log("Openbrowser",true);
}
@BeforeMethod
public void loginApp()
{
	Reporter.log("VerifyUserID2",true);
}
@Test
public void T1VerifyUserId()
{
	Reporter.log("VerifyUserID1",true);
}
@AfterMethod
public void logout()
{
	Reporter.log("click on logout",true);
}
@AfterTest
public void closebrowser()
{
	Reporter.log("closebrowser",true);
}
}

