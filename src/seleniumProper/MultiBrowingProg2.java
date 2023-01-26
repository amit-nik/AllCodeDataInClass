package seleniumProper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowingProg2 {
	static WebDriver driver;
	public static void main(String[] args) {
		
		String Browser = "firefox";	
		
		if(Browser.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();		
		}
		else if(Browser.equals("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();		
		}
		else if(Browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();			
		}
		else if(Browser.equals("Safari"))
		{
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();		
		}
		else
		{	
			driver = new ChromeDriver();		
		}
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/");
		driver.quit();

	}
}
