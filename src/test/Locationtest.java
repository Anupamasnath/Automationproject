package test;

import org.testng.annotations.Test;

import pages.Locationpage;

public class Locationtest extends Baseclass{
	
	@Test
	
	public void test()
	{
		Locationpage lp=new Locationpage(driver);
		lp.title("Software Tester");
		lp.savebtn();
	}

}
