package test;

import org.testng.annotations.Test;

import pages.Savepage;

public class Savetest extends Baseclass {
	
	@Test
	public void test()
	{
		Savepage obj=new Savepage(driver);
		obj.savbtn();
	}

}
