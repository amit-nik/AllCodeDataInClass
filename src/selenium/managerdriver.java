package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class managerdriver {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.firefoxdriver().setup();
//		System.setProperty("webdriver.chrome.driver","chromedriver_win32/chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://translate.google.com/");
		Thread.sleep(2000);
		driver.quit();
	}

}
