package test;



import org.testng.annotations.Test;

import pages.Createanaccountpage;

public class Createanaccounttest extends Baseclass{
	
	@Test
	
	public void signuptest() throws Exception
	{
		
		Createanaccountpage ob = new Createanaccountpage(driver);
		ob.signIn("anupama12@gmail.com");
		ob.btnClick1();
		ob.checkbox();
		ob.password("abcd@1234");
		ob.btnClick2();
	}

}
