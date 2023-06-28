package pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Searchpage {
	
	WebDriver driver;
	By title = By.xpath("//input[@placeholder='Job Title, Keywords or Company']");
	By location= By.xpath("//input[@data-test='search-bar-location-input']");
	By subbtn = By.xpath("//button[@data-test='search-bar-submit']");
	
	public Searchpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void autosearchtitle()
	{
		WebDriverWait waitt=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement e = waitt.until(ExpectedConditions.elementToBeClickable(title));
		e.sendKeys("Software Tester");
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='autocomplete-suggestions ']/div/div/span"));
		System.out.println("Total suggestions are: "+list.size());
		for(WebElement ele:list)
		{
			System.out.println("Suggestions are: "+ele.getText());
			if(ele.getText().equalsIgnoreCase("Software Tester")){
				
				ele.click();
				break;
				
			}
		}
	}
	public void location()
	{
		WebElement a = driver.findElement(location);
		String s = Keys.chord(Keys.CONTROL, "a");
		a.sendKeys(s);
		a.sendKeys(Keys.DELETE);
		a.sendKeys("Kochi");
		
		
	}
	public void searchbtn()
	{
		driver.findElement(subbtn).click();
	}
	public void alert_handling() throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		try {
			  //switch to alert and click ok button
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	
	}

}
