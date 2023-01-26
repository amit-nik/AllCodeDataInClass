package waitType;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class presenceOfElementLocatedProg {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait");
		
//		scenario: - 7 (after some time textbox/button will be present )
//		presenceOfElementLocated(locator) 
		
		WebElement selectButon = driver.findElement(By.xpath("//button[@id='display-other-button']"));
		WebElement enableButton = driver.findElement(By.xpath("//button[@id='hidden']"));
		selectButon.click();

		WebDriverWait w2 = new WebDriverWait(driver, Duration.ofSeconds(11));
		w2.until(ExpectedConditions.presenceOfElementLocated(null));
		
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
