package seleniumProper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowingProg1 {
	static WebDriver driver;
	public static void main(String[] args) {

		String Browser = "firefox";	
		switch (Browser) 
		{
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();		
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();		
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();		
			break;
		case "safari":
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();		
			break;
		default:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();		
			break;
		}
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/");
		driver.close();
	}

}
