package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot_sir {
	public static String captureScreenshot(WebDriver driver) throws IOException
	{ 
		 File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String path="C:\\Users\\HP\\OneDrive\\Documents\\21 MAY SS\\"+System.currentTimeMillis()+".jpg";
         File dest = new File(path);
         FileUtils.copyFile(source, dest);
		return path;}
}
