package test;

import org.testng.annotations.Test;

import pages.Useractivationpage;

public class Useractivationtest extends Baseclass {
	
	
	@Test
	public void user_activation() throws Exception
	{
		Useractivationpage ua = new Useractivationpage(driver);
		ua.askme();

		
	}

}
