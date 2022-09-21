package Test_package;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
 
import org.testng.annotations.Test;

import pom.Loginpage;
 
import utility.POJO;
import utility.Screenst;
import utility.Wait;

public class TestClass_A extends POJO   {
	WebDriver driver;
	WebDriverWait wait;
	@BeforeClass
	public void beforeClass()
	{
		OpenChromeBrowser();
		WebDriver driver = OpenChromeBrowser();
		this.driver=driver;
		
		
	}
	@BeforeMethod
	public void beforeMethod()
	{
		Wait.implicitwait(driver);
	}

	 	@Test
	public void verifyLoginpage() throws IOException
	{
		Loginpage Login = new Loginpage(driver);
		Login.sendUserName();
		Login.sendpassword();
		Login.clickonLoginbutton();
		Screenst.Capture(driver);
	}

    @Test
    public void testB()
	{System.out.println("testB");}
    
    @Test
    public void testC()
	{System.out.println("testC");}
    
     
    @AfterMethod
    public void  aftermethod()
	{System.out.println("aftermethod_ClassA");}
    
    @AfterClass
    public void  afterclass()
	{System.out.println("afterclass_ClassA");}
    
    @AfterTest
    public void  aftertest()
	{System.out.println("aftertest_ClassA");}
    
    @AfterSuite
    public void  aftersuite()
		{System.out.println(" aftersuite_ClassA");}
 

}
