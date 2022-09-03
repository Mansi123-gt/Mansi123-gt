package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Testbase;

public class DashboardPage extends Testbase {
@FindBy(xpath="//div[@id='avatar-84']")private WebElement nicknameLabel;
@FindBy(xpath="//span[@class='user-id']")private WebElement useridLabel;
@FindBy(xpath="//div[@class='email']")private WebElement EmailIdLabel;
@FindBy(xpath="//h4[@class='username']")private WebElement usernameText;
@FindBy(xpath="//span[text()='PV']")private WebElement loginclick;
public DashboardPage()
{
	PageFactory.initElements(driver,this);
}

public String verifynickname()
{

     return nicknameLabel.getText();
}
public String verifyuseridLabel()
{
	
	return useridLabel.getText();
}

public String verifyEmailIdLabel1()
 
{
	return EmailIdLabel.getText();
	
}
public void useridClick()
{
	loginclick.click();
}
}
