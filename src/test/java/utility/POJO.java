package utility;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POJO {
	
	public static WebDriver OpenChromeBrowser() 
	
	{
		System.setProperty("webdriver.chrome.driver","src"+File.separator+ "test"+File.separator+"resources"+File.separator+"Driver"+File.separator+"chromedriver_win32 (1)"+File.separator+"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login ");
		return driver;
	}
	
	
	
	
	
	
	

}
