package mouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseHoverOverProg {

	public static void main(String[] args) throws Exception {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement loginButt = driver.findElement(By.xpath("//a[text()='Login']"));
//		WebElement WishlistButt = driver.findElement(By.xpath("//div[text()='Wishlist']"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.moveToElement(loginButt).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Wishlist']")).click();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
