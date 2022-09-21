package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenst  
	{  
	static WebDriver driver;
	public static void Capture(WebDriver driver) throws IOException {
		
		 
		
		   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   Date d = new Date();
		   
		   SimpleDateFormat AddDate=new SimpleDateFormat ("ddMMYYYY_HHmmsss");
		   String time = AddDate.format(d);
		   File dest = new File("C:\\Users\\HP\\OneDrive\\Documents\\21 MAY SS\\Img"+time +".jpeg");
		   
		   FileHandler.copy(source, dest);
		   
		    
		   
		
		

}
}