package Utility;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {
	
public static void screenCapture(WebDriver driver,String methodName) throws Exception
{
	TakesScreenshot s=(TakesScreenshot)driver;
	File source = s.getScreenshotAs(OutputType.FILE);
    File dest=new File("C:\\eclipse\\Frame1\\TestData\\Screenshot\\"+methodName+".png");
    FileHandler.copy(source, dest);
}

}
