package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Savepage {
	
	WebDriver driver;
	By savebtn= By.xpath("//div[@class='css-radise e1rlw03b0']/div/div[2]/button");

	public Savepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void savbtn()
	{
		WebDriverWait tn = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement elem=tn.until(ExpectedConditions.visibilityOfElementLocated(savebtn));
		elem.click();
	}
}
