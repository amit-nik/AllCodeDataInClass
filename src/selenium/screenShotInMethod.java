package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenShotInMethod {
	
	static WebDriver driver;
//	when we create a method for screeenshot at that time 'webDriver driver' declare globaly
	public static void caotureFullPageScreenshot() throws Exception
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\tambe\\eclipse-workspace\\Practice\\screenShot\\photo7.jpeg");
		FileHandler.copy(source, dest);
	}
//	take screenShot for web element
	public static void webElementScreenShot() throws Exception
	{
		WebElement facebookLogo = driver.findElement(By.xpath("//div[@class='_8iep _8icy _9ahz _9ah-']"));
		File sour = facebookLogo.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\tambe\\eclipse-workspace\\Practice\\screenShot\\photo6.jpeg");
		FileHandler.copy(sour, des);
	}
	
	public static void fullScreenShot() throws Exception {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\tambe\\eclipse-workspace\\Practice\\screenShot\\photo5.jpeg");
		FileHandler.copy(source, dest);
		
		caotureFullPageScreenshot();
		webElementScreenShot();
		
		driver.quit();
//		driver.clear();   this method is not suported firefox brawser
		
		
	}

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest  = new File("C:\\\\Users\\\\tambe\\\\eclipse-workspace\\\\Practice\\\\screenShot\\\\photo1.jpeg");
//		FileHandler.copy(source, dest);
		
	    caotureFullPageScreenshot();
	    webElementScreenShot();
	    fullScreenShot();
		
		Thread.sleep(2000);
		driver.close();
	}

}
