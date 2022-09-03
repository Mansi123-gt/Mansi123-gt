package Testpages;

import org.testng.annotations.Test;
import java.time.Duration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Base.Testbase;
import Pages.LoginPage;
import Pages.OrderPage;


public class OrderPageTest extends Testbase{
LoginPage Login;
OrderPage Orderdata;

@BeforeMethod
public void setup() throws Throwable 
{
	
	initialization();
	Login=new LoginPage();
	Orderdata=new OrderPage();
	Login.LoginZerodhaApp();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
}
//@Test
//public void OrderBtnTest() 
//{
//	Orderdata.Orderbtn();
//}
//@Test
//public  void verifySIPTest()
//{
//	Orderdata.Orderbtn();
//	String acttext=Orderdata.verifySIP();
//	System.out.println(acttext);
//	//System.out.println(Orderdata.verifyBaskets());
//}
//@Test
//public void verifyBasketOrderTest()
//{
//	System.out.println(Orderdata.verifyBaskets());
//}
@Test
public void GTToperationTest() throws Throwable
{
	Orderdata.GTTOperation();
	Thread.sleep(5000);
}
//@Test
//public void verifyGTTTest()
//{
//	.clic
//System.out.println());
//}
//	
@AfterMethod

public void Exit()
{
	driver.close();
}
}
