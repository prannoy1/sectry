package tryMavenpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	//public WebDriver driver;
	
	@Test				
	public void testEasy() {
		String exePath = "C:\\Users\\prannoy.rattan\\Downloads\\chromeDriver\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();  
		driver.get("http://www.guru99.com/selenium-tutorial.html");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Free Selenium Tutorials"));
		driver.quit();
	}	
	@BeforeTest
	public void beforeTest() {	
		
	}		
	@AfterTest
	public void afterTest() {
					
	}		

}
