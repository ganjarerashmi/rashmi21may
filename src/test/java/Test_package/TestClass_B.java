package Test_package;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Loginpage;
import pom.homepage;
import utility.POJO;
import utility.Screenshot_sir;
import utility.Screenst;
import utility.Wait;

public class TestClass_B extends POJO{
	WebDriver driver;
	@BeforeClass
	public void beforeClass()
	{OpenChromeBrowser();
	WebDriver driver = OpenChromeBrowser();
	this.driver=driver;
	  
}
		 	
	  
	
	@Test
	public void verifyLoginpage() throws IOException
	{
		Wait.implicitwait(driver);
		Loginpage Login = new Loginpage(driver);
		Login.sendUserName();
		Login.sendpassword();
		Login.clickonLoginbutton();
		Screenshot_sir.captureScreenshot(driver);
	}

    @Test
    public void  verifyHomePage() throws IOException
	{
		homepage home = new homepage(driver);
		home.verifyAdminTab();
		home.verifyPIMTab(); 
		home.verifyLeaveTab();
		Screenshot_sir.captureScreenshot(driver);
	} 
    @Test
    public void testC()
	{System.out.println("testC");} 
    
    @AfterMethod
    public void  aftermethod()
	{System.out.println("aftermethod_ClassB");}
    
    @AfterClass
    public void  afterclass()
	{System.out.println("afterclass_ClassB");}
    
    

}
