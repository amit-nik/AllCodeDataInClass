package waitType;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class elementToBeClickableProg {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait");
		
//		scenario: - 3 (after some time textbox/button will be visible 
//		elementToBeClickable(locator)
			WebElement buttonvisible = driver.findElement(By.xpath("//button[@id='display-other-button']"));
			WebElement hiddenButon = driver.findElement(By.xpath("//button[@onclick='setTimeout(hide,10000);']"));
			buttonvisible.click();
			WebDriverWait w2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			w2.until(ExpectedConditions.elementToBeClickable(hiddenButon));		
		
			driver.close();
	}

}
