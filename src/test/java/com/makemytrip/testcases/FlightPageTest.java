package com.makemytrip.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.makemytrip.base.BaseTest;
import com.makemytrip.pages.HomePage;

public class FlightPageTest extends BaseTest{
	
	@Test
	public void searchFlight() 
	{
		test = extent.createTest("Search Flight Test");
		HomePage home = new HomePage();
		home.selectFlightMenu();
		test.log(Status.INFO, "	Clicked On Flight Menu");
		home.roundTripMenu();
		test.log(Status.INFO, "	Clicked On Round trip Menu");
		home.enterDepartureCity();
		test.log(Status.INFO, "	Entered The Departured City");
		home.enterReturnCity();
		test.log(Status.INFO, "	Entered The Return  City");
		home.enterDepartureDate();
		test.log(Status.INFO, "	Entered The Departured Date");
		home.enterReturnDate();
		test.log(Status.INFO, "	Entered The Retured City");
		//home.searchButton();
		//test.log(Status.INFO, "	clicked The search button ");
	}
}
