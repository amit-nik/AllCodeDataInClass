package waitType;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class visibilityOfElementLocatedProg {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait");
		
//		scenario: - 4 (after some time textbox/button will be Enable )
//		visibilityOfElementLocated(locator)  or  presenceOfElementLocated(locator) 
		WebElement buttonEnable = driver.findElement(By.xpath("//button[@id='display-other-button']"));
//		WebElement enableButon = driver.findElement(By.xpath("//button[@id='hidden']"));
		buttonEnable.click();
		WebDriverWait w2 = new WebDriverWait(driver, Duration.ofSeconds(11));
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
		
		driver.close();
		
	}

}
