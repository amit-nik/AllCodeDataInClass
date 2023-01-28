package ActionClassProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class doubleClickProg {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement doubleClickButt =  driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(doubleClickButt).doubleClick().build().perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
