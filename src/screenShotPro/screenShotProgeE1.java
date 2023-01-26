package screenShotPro;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenShotProgeE1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");

		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
		File sourec = element.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\tambe\\eclipse-workspace\\Practice\\screenShot\\photo3.jpeg");
		FileHandler.copy(sourec, dest);
		Thread.sleep(5000);
		driver.close();
			
	}
	
}
