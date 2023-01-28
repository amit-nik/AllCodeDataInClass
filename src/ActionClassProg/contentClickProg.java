package ActionClassProg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class contentClickProg {

	public static void main(String[] args) throws Exception {

//		contextClick --> To perform mouse right click action
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightClickutt = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(rightClickutt).contextClick().build().perform();
		
		for(int i = 0; i<=4; i++)
		{
			Thread.sleep(1000);
			a.sendKeys(Keys.DOWN).build().perform();
		}
		for(int i = 0; i<=2; i++)
		{
			Thread.sleep(1000);
			a.sendKeys(Keys.ARROW_UP).build().perform();
		}
		a.sendKeys(Keys.ENTER).perform();
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		driver.close();
	}

}
