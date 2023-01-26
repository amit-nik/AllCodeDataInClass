package waitType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class threadSleepWait {
//	This Method Thread.Sleep(); is java method.
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.atlassian.com/");
//		this wait is dead wait. doesn't matter webElement is found or not.
//		this wait stop the program 2 seconds.
		Thread.sleep(2000);
		driver.close();
	}

}
