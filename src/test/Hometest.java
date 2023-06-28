package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Homepage;

public class Hometest extends Baseclass {
	
	
	@Test
	public void first(){
	Homepage pg = new Homepage(driver);
	pg.linkclick();
	}
}
