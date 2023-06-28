package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locationpage {
	
	WebDriver driver;
	By jobloc=By.xpath("//input[@name='member-home-datacollection-jobtitle']");
	By btn=By.xpath("//button[@class='gd-ui-button  css-1dqhu4c']");
	
	public Locationpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public void title(String desiredjob)
	{
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement el =wait1.until(ExpectedConditions.visibilityOfElementLocated(jobloc));
		el.sendKeys("Software Tester");	
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='css-1htgz7a']/ul/li"));
		System.out.println("Total suggestions are: "+list.size());
		for(WebElement ele:list)
		{
			System.out.println("Suggestions are: "+ele.getText());
			if(ele.getText().equalsIgnoreCase(desiredjob)){
				
				ele.click();
				break;
			}
		}
	}
	
	public void savebtn()
	{
		driver.findElement(btn).click();
	}

}

