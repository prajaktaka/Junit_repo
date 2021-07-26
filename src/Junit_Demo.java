import java.util.concurrent.TimeUnit; 
import org.junit.AfterClass; 
import org.junit.BeforeClass; 
import org.junit.Test; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 


public class Junit_Demo 
{   
	static WebDriver driver; 
	
	@BeforeClass public static void BrowserOpen() 
	{
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");     
		driver= new ChromeDriver() ;     
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	}
	
	@Test public void Register_User() 
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	} 

	@AfterClass public static void BrowserClose() 
	{
		driver.quit(); 
	}   
}