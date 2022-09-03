package Testpages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelTest {
	WebDriver driver;
	@Test
	public	void openFB() throws Throwable
	{
		
	//System.setProperty("webdriver.chrome.driver",	"chromedriver");
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//Thread.sleep(1000);
	//driver.close();
	}
	@Test
	public	void openGoogle() throws Throwable
	{
	//System.setProperty("webdriver.chrome.driver",	"chromedriver");
	// WebDriver	driver	=	new	ChromeDriver();
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	//Thread.sleep(1000);
	//driver.close();
	}
	@Test
	public	void openRediff() throws Throwable
	{
	//System.setProperty("webdriver.chrome.driver",	"chromedriver");
	// WebDriver	driver	=	new	ChromeDriver();
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com/");
	//Thread.sleep(1000);
	//driver.close();
	}
	@Test
	public	void	openKite() throws Throwable
	{
	//System.setProperty("webdriver.chrome.driver",	"chromedriver");
	// WebDriver	driver	=	new	ChromeDriver();
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	//Thread.sleep(1000);
	//driver.close();
	}
	}
