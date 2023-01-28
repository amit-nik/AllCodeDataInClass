package ActionClassProg;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementProg {

//	moveToElement --> To perform mouse left click action
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		
		WebElement mobileBox = driver.findElement(By.xpath("//input[@name='mobile']"));
		WebElement emailBox = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement loginButt = driver.findElement(By.xpath("//button[@id='irtct-acc-detail']"));
		
		mobileBox.sendKeys("6060605548");
		emailBox.sendKeys("abc@gmail.com");
		loginButt.click();
		
		WebElement occDropDown = driver.findElement(By.xpath("(//div//button[@data-toggle='dropdown'])[1]"));
		Actions a = new Actions(driver);
		Thread.sleep(5000);
		a.moveToElement(occDropDown).click().build().perform();
		for(int i = 0; i<=5; i++)
		{
			Thread.sleep(1000);
			a.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		for(int i = 0; i<=5; i++)
		{
			Thread.sleep(1000);
			a.sendKeys(Keys.UP).build().perform();
		}
		a.sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(5000);
		driver.close();
		
		
		
		}


}
