package Base;



import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.ReadExcel;
import Utility.ReadProperty;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {


	public static WebDriver driver;
public void initialization() throws Throwable
{
	
//	WebDriverManager.chromedriver().setup();
//    driver=new ChromeDriver();
	String browserValue=ReadExcel.readExcelFile(2,1);
	
	if(browserValue.equals("chrome"))
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
	    driver=new ChromeDriver(options);
	    
	}
	else if(browserValue.equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else if(browserValue.equals("edge"))
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	//ReadProperty rt=new ReadProperty();//non static
	//driver.get(readExcelFile(2,0));
	driver.get(ReadProperty.readPropertyfile("url"));//static
	//driver.get(rt.readPropertyfile("url"));//non static
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}

}

