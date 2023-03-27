package waitType;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class elementSelectionStateToBeProg {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait");
		
//		scenario: - 6 (The checkbox will be checked in 0 Seconds is true or false )
//		elementSelectionStateToBe(selectButon , true)
				WebElement buttonselect = driver.findElement(By.xpath("//button[@id='checkbox']"));
						WebElement selectButon = driver.findElement(By.xpath("//input[@type='checkbox']"));
				buttonselect.click();
				WebDriverWait w2 = new WebDriverWait(driver, Duration.ofSeconds(11));
				w2.until(ExpectedConditions.elementSelectionStateToBe(selectButon , true));
				
				driver.close();
		
	}

}
