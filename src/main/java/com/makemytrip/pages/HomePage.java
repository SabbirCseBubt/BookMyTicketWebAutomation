package com.makemytrip.pages;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.makemytrip.base.BaseTest;
import com.makemytrip.util.TestUtil;

public class HomePage  extends BaseTest {
	
	
	@FindBy(xpath="(//span[@class='headerIconTextAlignment chNavText darkGreyText'][normalize-space()='Flights'])[1]")
	WebElement flightMenu;
	
	@FindBy(xpath="//li[contains(text(),'Round Trip')]")
	WebElement roundTripMenu;
	
	@FindBy(xpath="//input[@id='fromCity']")
	WebElement fromCityDrop;
	
	@FindBy(xpath="//input[@placeholder='From']")
	
	WebElement searchFromCity;
	
	@FindBy(xpath="//input[@placeholder='To']")
	WebElement searchToCity;
	
	
	@FindBy(xpath="//span[normalize-space()='Departure']")
	WebElement departureDrop;
	
	@FindBy(xpath="//span[normalize-space()='Return']")
	WebElement returnDrop;
	
	String departureDate = "//div[@aria-label='Thu Aug 21 2025']//p[contains(text(),'21')]";

    String returnDate = "//div[@aria-label='Thu Aug 21 2025']//p[contains(text(),'21')]";
	
	@FindBy(xpath="//a[normalize-space()='Search']")
	WebElement SearchBtn;
	
	
	public HomePage() 
	{
		
		super();
		PageFactory.initElements(driver, this);		
		
		
	}
	
	public void selectFlightMenu() 
	{
		
		flightMenu.click();
		
	}
	
	public void roundTripMenu() 
	{
		
		roundTripMenu.click();
	}
	
	public void enterDepartureCity() 
	{
		
		fromCityDrop.click();
		searchFromCity.sendKeys(config.getProperty("From"));
		searchFromCity.sendKeys(Keys.TAB);
	}
	
	public void enterReturnCity() 
	{
		
		searchToCity.sendKeys(config.getProperty("To"));
		searchToCity.sendKeys(Keys.TAB);
	}
	
	public void enterDepartureDate() 
	{
		departureDrop.click();
		TestUtil date= TestUtil.getCurrentDateandReturnDate();
		driver.findElement(TestUtil.customXpath(departureDate, date.departureDate)).click();
		
	}
	
	public void enterReturnDate() 
	{
		departureDrop.click();
		TestUtil date= TestUtil.getCurrentDateandReturnDate();
		driver.findElement(TestUtil.customXpath(returnDate, date.returnDate)).click();

	}
	
//	public void searchButton() 
//	{
//		
//		SearchBtn.click();
//	}
}
