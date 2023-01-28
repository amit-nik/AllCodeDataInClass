package HandleListBoxANDSelectClassProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectClassProg1 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");		
		
		WebElement dayBox = driver.findElement(By.xpath("//select[@name='date_day']"));
		WebElement monthBox = driver.findElement(By.xpath("//select[@name='date_mon']"));
		WebElement yearBox = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		
		Select a = new Select(dayBox);
		a.selectByIndex(2);
		Thread.sleep(2000);
		a.selectByValue("06");    		
		Thread.sleep(2000);
		a.selectByVisibleText("08");
		Thread.sleep(2000);
		
		Select b = new Select(monthBox);
		b.selectByIndex(2);
		Thread.sleep(2000);
		b.selectByValue("06");    		
		Thread.sleep(2000);
		b.selectByVisibleText("SEP");
		Thread.sleep(2000);

		Select c = new Select(yearBox);
		c.selectByIndex(2);
		Thread.sleep(2000);
		c.selectByValue("1997");    		
		Thread.sleep(2000);
		c.selectByVisibleText("2001");
		
		Thread.sleep(5000);
		driver.close();
	}

}
