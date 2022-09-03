package Pages;

import java.time.Duration;



import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Testbase;
import Utility.ReadExcel;
import Utility.ReadProperty;

public class LoginPage extends Testbase {

	
	
	
	@FindBy(xpath="//input[@id='userid']")private WebElement userIDTextbox;
	@FindBy(xpath="//input[@id='password']")private WebElement passwordTextbox;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement LoginButton;
	@FindBy(xpath="//input[@id='pin']")private WebElement pintextbox;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement Continuebutton;
	@FindBy(xpath="//a[@class='logo kite-logo']")private WebElement KiteLogo;
	@FindBy(xpath="//header[@class='header text-center']")private WebElement KiteLabel;
	//@FindBy(xpath="")private WebElement KiteLabel;
    //@FindBy(xpath="//img[@alt='Kite Android']")private WebElement KiteAndroidApp;
   // @FindBy(xpath="//a[@title='Download Kite Android from Play store']")private WebElement PlaystoreApp; 
	
    public LoginPage()
    {
    	PageFactory.initElements(driver, this);
    }
    
    
    
    public void LoginZerodhaApp() throws Throwable
    {
    	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	userIDTextbox.sendKeys(ReadExcel.readExcelFile(0,0));
    	passwordTextbox.sendKeys(ReadExcel.readExcelFile(0,1));
    	Thread.sleep(2000);
    	LoginButton.click();
    	pintextbox.sendKeys(ReadExcel.readExcelFile(0,2));
    	Continuebutton.click();
    	Thread.sleep(2000);
    	
    	
//    	userIDTextbox.sendKeys(readPropertyfile("userid"));
//    	passwordTextbox.sendKeys(readPropertyfile("password"));
//    	Thread.sleep(2000);
//    	LoginButton.click();
//    	pintextbox.sendKeys(readPropertyfile("pin"));;
//    	Continuebutton.click();
//    	Thread.sleep(2000);
    	
    }
    public boolean verifyKiteLogo()
    {
    	return KiteLogo.isDisplayed(); 
    }
    public String verifyAppTitle()
    {
    	return driver.getTitle(); 
    }
    public String verifyKiteLabel()
    {
		return KiteLabel.getText();
    	
    }
}
   
   
    


