package test;

import org.testng.annotations.Test;

import pages.Searchpage;

public class Searchtest extends Baseclass{
	
	@Test
	public void test() throws InterruptedException
	{
		Searchpage sp=new Searchpage(driver);
		//sp.jobselection();
		sp.autosearchtitle();
		sp.location();
		sp.searchbtn();
		//sp.alert_handling();
	}

}
