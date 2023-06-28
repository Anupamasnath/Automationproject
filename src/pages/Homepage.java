package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	WebDriver driver;
	By lo = By.xpath("//a/strong[contains(text(),'Add a location to your profile')]");
	public Homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	public void linkclick()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(lo));
		element.click();
	}

}
