package waitType;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class alertIsPresentProg {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait");

//		scenario: - 1 (alert popup handle)
//		alertIsPresent()
				WebElement alertButton1 = driver.findElement(By.id("alert"));
				alertButton1.click();
				
				WebDriverWait waitAlert = new WebDriverWait(driver, Duration.ofSeconds(10));
				waitAlert.until(ExpectedConditions.alertIsPresent());
				driver.switchTo().alert().accept();

		driver.close();

	}

}
