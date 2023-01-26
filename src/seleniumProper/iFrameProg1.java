package seleniumProper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameProg1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		WebElement timeButton = driver.findElement(By.xpath("//button[@type='button']"));
		timeButton.click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		WebElement homeButton = driver.findElement(By.xpath("//a[@id='tryhome']"));
		homeButton.click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);		
		driver.switchTo().frame("iframeResult");
		WebElement timeButton1 = driver.findElement(By.xpath("//button[@type='button']"));
		timeButton1.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.quit();
		
	}

}
