package com.makemytrip.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.makemytrip.base.BaseTest;

public class TestUtil extends BaseTest{
	
	
	public static String departureDate;
	public static String returnDate;
	
	public static TestUtil getCurrentDateandReturnDate() 
	{
		
		TestUtil date =new TestUtil();
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		String [] dateArr=cal.getTime().toString().split(" ");
		TestUtil.departureDate=dateArr[0]+""+dateArr[1]+""+dateArr[2]+""+dateArr[5];
		
		cal.add(Calendar.DATE,2);
		dateArr=cal.getTime().toString().split(" ");
		TestUtil.returnDate=dateArr[0]+""+dateArr[1]+""+dateArr[2]+""+dateArr[5];
		return date;
	}
	
	
	public static By customXpath(String xpath, String parm) 
	{
		String rawpath=xpath.replaceAll("%replace%", parm);
		return By.xpath(rawpath);
		
	}
	
	public static String getScreenshot() {
        String currentDate = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "\\src\\test\\resources\\screenshots/" + currentDate + ".png";
        try {
			FileHandler.copy(source, new File(destination));
		} catch (IOException e) {
			
			System.out.println("Failed to Capture The Ss"+e.getMessage());
			// TODO Auto-generated catch block
			
		}
        return destination;
    }
	

}
