package waitType;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class textToBePresentInElementProg {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait");
		
//		scenario: - 2 (after some time text is visible)
//		textToBePresentInElement(locator, text)
			WebElement textVisiButt = driver.findElement(By.xpath("//button[@id='populate-text']"));
			WebElement text = driver.findElement(By.xpath("//h2[@id='h2']"));
			textVisiButt.click();
			WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			w1.until(ExpectedConditions.textToBePresentInElement(text, "Selenium Webdriver"));
		
			driver.close();
	}

}
