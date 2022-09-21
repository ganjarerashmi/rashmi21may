package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	
	@FindBy (xpath=" //*[text()='Admin']")
    private WebElement admin;
	
	@FindBy (xpath=" //*[text()='PIM'] ")
    private WebElement PIM;
	
	@FindBy (xpath="//*[text()='Leave'] ")
    private WebElement Leave;

	
	public homepage(WebDriver driver)
	{ 
		PageFactory.initElements(driver,this);
	}
	
	public void verifyAdminTab()
	{
		admin.isDisplayed();
	}
	public void verifyPIMTab()
	{
		PIM.isDisplayed();
	}
	
	public void verifyLeaveTab()
	{
		Leave.isDisplayed();
	}
}



	
	
	
	
























 