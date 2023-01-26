package waitType;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageLoadTimeOutProg {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		This page load time Out use to set the time for open the browser for 
//		checking performance testing.
//		If the browser not open the set time that time selenium throw the 
//		timeOutException
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");         //E commerce app less time for load
//		driver.get("https://edition.cnn.com/");       //news app don't know which type of 
													 //app but load time is more as compare 
													//amazon or flipcart.
	
		driver.close();
		
	}

}
