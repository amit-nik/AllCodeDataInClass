package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
	
public class DragAndDrop {

		public static void main(String[] args) throws Exception {

			System.setProperty("webdriver.chrome.driver","chromedriver_win32/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			
			WebElement mony2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
			WebElement mony1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
			WebElement bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
			WebElement sales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
			WebElement Daccount = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
			WebElement Damount = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
			WebElement Caccount = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
			WebElement Camount = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
			
			Actions a = new Actions(driver);
			
			a.dragAndDrop(bank, Daccount).build().perform();
			Thread.sleep(5000);
			
			a.dragAndDrop(mony1, Damount).build().perform();
			Thread.sleep(5000);
			
			a.dragAndDrop(sales, Caccount).build().perform();
			Thread.sleep(5000);
			
			a.dragAndDrop(mony2, Camount).build().perform();
			Thread.sleep(5000);
			
		
			driver.quit();
		}

}
