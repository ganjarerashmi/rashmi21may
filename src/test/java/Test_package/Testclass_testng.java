package Test_package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testclass_testng 
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod");
	}
	@Test
	public void testA()
	{System.out.println("testA");}

    @Test
    public void testB()
	{System.out.println("testB");}
    
    @Test
    public void testC()
	{System.out.println("testC");}
    
     
    @AfterMethod
    public void  aftermethod()
	{System.out.println("aftermethod");}
    
    @AfterClass
    public void  afterclass()
	{System.out.println("afterclass");}
    
    

    
    
    
}
