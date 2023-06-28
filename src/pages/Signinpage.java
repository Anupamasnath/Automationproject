package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Signinpage {
WebDriver driver;
	
		
	By status = By.xpath("//*[@id=\"Container\"]/div/div/div/div/div/a[3]");
	public Signinpage(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void jobstatus()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

 
		WebElement stat = driver.findElement(status);
		System.out.println(stat.getText());
		stat.click();
		
			
		
		
	}
}	
		
	


