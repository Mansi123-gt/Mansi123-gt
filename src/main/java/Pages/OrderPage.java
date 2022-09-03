package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Testbase;
import Utility.ReadExcel;

public class OrderPage extends Testbase {

	@FindBy(xpath="//a[@class='orders-nav-item']")private WebElement order ;
	@FindBy(xpath="//a[@class='router-link-exact-active router-link-active']")private WebElement orders ;
	@FindBy(xpath="//span[text()='GTT']")private WebElement GTT ;
	@FindBy(xpath="//a[@class='router-link-exact-active router-link-active']")private WebElement Baskets ;
	@FindBy(xpath="//span[text()='SIP']")private WebElement SIP ;
	@FindBy(xpath="//span[text()='Alerts']")private WebElement Alerts ;
	@FindBy(xpath="//button[@type='button']")private WebElement NewGTT;
	@FindBy(xpath="(//input[@type='text'])[2]")private WebElement SearchBar;
	@FindBy(xpath="//ul[@class='omnisearch-results']//li[@class='search-result-item selected']")private WebElement nifty;
    @FindBy(xpath="(//button[@type='button'])[2]")private WebElement CreateGTT;
    @FindBy(xpath="//input[@id='radio-282']")private WebElement BuyButton;
    @FindBy(xpath="(//input[@type='number'])[1]")private WebElement triggerPrice;
    @FindBy(xpath="(//input[@type='number'])[3]")private WebElement quantity;
    @FindBy(xpath="(//input[@type='number'])[4]")private WebElement price;
    @FindBy(xpath="//button[@class='button-outline cancel']")private WebElement cancelbutton;
	public OrderPage()
	{
		PageFactory.initElements(driver,this);
	}
	
//	public void Orderbtn() 
//	{
//		order.click();
//		orders.click();
//	}
//	public String verifyGTT()
//	{
//		return GTT.getText();
//	}
//    public String verifyBaskets()
//	{
//		return Baskets.getText();
//	}
//	public String verifySIP()
//	{
//		return SIP.getText();
//	}
	public void GTTOperation() throws Throwable
	{
		order.click();
		GTT.click();
		NewGTT.click();
		
		SearchBar.sendKeys(ReadExcel.readExcelFile(4,0));
		Actions act=new Actions(driver);
		act.moveToElement(SearchBar).click().build().perform();
		for(int i=0;i<5;i++)
		{
			Thread.sleep(500);
			act.sendKeys(Keys.DOWN).build().perform();
		}
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		CreateGTT.click();
		triggerPrice.clear();
		triggerPrice.sendKeys(ReadExcel.readExcelFile(4,1));
		Thread.sleep(2000);
		quantity.clear();
		quantity.sendKeys(ReadExcel.readExcelFile(4,2));
		Thread.sleep(2000);
		price.clear();
		price.sendKeys(ReadExcel.readExcelFile(4,3));
		Thread.sleep(2000);
		cancelbutton.click();
		
		
		
	}
	//public String verifyAlerts()
//	{
//		return Alerts.getText();
//	}




}

