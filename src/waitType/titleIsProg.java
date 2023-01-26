package waitType;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class titleIsProg {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait");
		
//		scenario: - 8 (titile)
//		titleIs("selenium webdriver sample")
			     driver.findElement(By.xpath("//button[@class='alert']")).click();
			     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));
			     //throws TimeoutException if title does not contain give string
			     wait.until(ExpectedConditions.titleIs("selenium webdriver sample"));
			     
			     driver.close();
		
	}

}
