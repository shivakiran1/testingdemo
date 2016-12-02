package sel_git_demo.git;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {

	WebDriver driver; 
	//WebElement element; 
	String baseurl ="https://www.orbitz.com/";
	//String actualTitle = "";

	
	@Test
	  public void testOrbitz() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("package-origin")).sendKeys("Chicago, IL (ORD-O'Hare Intl.)");
		driver.findElement(By.id("package-destination")).sendKeys("Logan International Airport (BOS), Massachusetts");
		driver.findElement(By.id("package-departing")).sendKeys("11/01/2016");
		driver.findElement(By.id("package-returning")).sendKeys("11/06/2016");
		driver.findElement(By.id("search-button")).click();
		driver.manage().timeouts().wait();
	  }
	  @BeforeTest
	  public void beforeTest() {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\shivakiran\\Downloads\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.get(baseurl);
	  }

	  @AfterTest
	  public void afterTest() {
		  
	  }
  

}