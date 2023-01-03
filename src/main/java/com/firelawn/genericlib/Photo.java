package com.firelawn.genericlib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Photo {

	public void getPhoto(WebDriver driver,String name) throws IOException
	{
		 Date d=new Date();
		String currentDate = d.toString().replaceAll(":","-");
		
		TakesScreenshot ts=(TakesScreenshot) driver; //typecasting
		
		File src=ts.getScreenshotAs(OutputType.FILE); //ram kulla iruku photo
		
		File dest=new File(AutoConstant.PhotoPath+currentDate+name+".png"); //project la photo la vai
		
		FileUtils.copyFile(src, dest);//fileah irukura photova copy panni vaikum.
	}

	
	
}
