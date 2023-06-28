package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Createanaccountpage {
	
	WebDriver driver;
	
	By email = By.name("username");
	By continuebtn = By.xpath("//span[text()='Continue with Email']");
	By password = By.name("password");
	By showpswd = By.xpath("//div[@class='checkboxBox']");
	By signin = By.xpath("//button[@name='submit']");
	
	public Createanaccountpage(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void signIn(String emailid)
	{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	WebElement ele=	wait.until(ExpectedConditions.visibilityOfElementLocated(email));
	ele.sendKeys(emailid);
	}	

	public void btnClick1()
	{
		driver.findElement(continuebtn).click();
	}
	public void checkbox() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement ele3 = wait.until(ExpectedConditions.visibilityOfElementLocated(showpswd));
		String actual = ele3.getAttribute("class");
		String expected = "checkboxBox";
		System.out.println("Actual = " +actual);
		Assert.assertEquals(actual, expected);
		if(ele3.isSelected())
		{
			System.out.println("Already selected");
		}
		else
		{
			System.out.println("Not selected");
		}
	}
	public void password(String pswd)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement ele1 = wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		ele1.sendKeys(pswd);
		
	}
	public void btnClick2() throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement ele2 = wait.until(ExpectedConditions.visibilityOfElementLocated(signin));
		ele2.click();
		Thread.sleep(4000);
	}
	
		
	
	

}
