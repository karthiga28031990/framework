package com.firelawn.genericlib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;




public class BaseClass {
	 public FileUtilities fs=new FileUtilities();
	 public WebDriverUtilities webdri=new WebDriverUtilities();
	  public WebDriver driver;
	
	
  @BeforeMethod
	public void openApp() throws IOException
	{
	   WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(fs.getProperties("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}

  @AfterMethod

 	public void closeApp(ITestResult res) throws IOException //Itestresult interface itest testng la iruku
 	{
     	int status = res.getStatus(); 
     	 String name=res.getName();  //  lot of testcases irukum.entha testcase fail aayiruko antha tc eduthu kudukum.
     	 
 	 if(status==2)      //1==pass; 2== fail; 3==skip.
 		{
     		 Photo p=new Photo();        //photo classku object create panrom.
     	p.getPhoto(driver, name);  
     	 }
 		driver.quit();
 	}
 	
 	}



