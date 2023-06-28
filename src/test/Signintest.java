package test;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;


import pages.Signinpage;

public class Signintest extends Baseclass {
	

	
@Test
	public void home()
	{
		Signinpage ob = new Signinpage(driver);
		ob.jobstatus();
	}

}
