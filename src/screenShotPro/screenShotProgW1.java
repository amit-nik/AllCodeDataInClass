package screenShotPro;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenShotProgW1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest  = new File ("C:\\Users\\tambe\\eclipse-workspace\\Practice\\screenShot\\photo.jpeg");
		FileHandler.copy(source, dest);
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
