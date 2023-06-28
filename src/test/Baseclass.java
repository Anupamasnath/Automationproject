package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {

	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		
		driver = new ChromeDriver();
		driver.get("https://www.glassdoor.co.in/index.htm");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("anupama12@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue with Email']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement ele1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		ele1.sendKeys("abcd@1234");	
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement ele2 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Container']/div/div/div/div/div/a[3]")));
		ele2.click();
		driver.findElement(By.xpath("//span[contains(text(),'Ask me later')]")).click();

		WebDriverWait waitt=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement e = waitt.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Job Title, Keywords or Company']")));
		e.sendKeys("Software Tester");
		WebElement a = driver.findElement(By.xpath("//input[@data-test='search-bar-location-input']"));
		String s = Keys.chord(Keys.CONTROL, "a");
		a.sendKeys(s);
		a.sendKeys(Keys.DELETE);
		a.sendKeys("Kochi");
		driver.findElement(By.xpath("//button[@data-test='search-bar-submit']")).click();
//		WebDriverWait wa = new WebDriverWait(driver,Duration.ofSeconds(30));
//		WebElement we = wa.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/partner/jobListing.htm?pos=101&ao=1136043&s=58&guid=00000188f0e1cc26ae690a1e533fe964&src=GD_JOB_AD&t=SR&vt=w&uido=BE76E03B52710D551F76A3592B14E4E5&cs=1_fd60c9d5&cb=1687668509924&jobListingId=1008690538401&jrtk=3-0-1h3oe3j25jm4g801-1h3oe3j2tgai1800-410dcf0229ee0349-']")));
//		we.click();
		
		}
	
	
	@AfterClass
	public void teardown()
	{
		//driver.quit();
	}
}
