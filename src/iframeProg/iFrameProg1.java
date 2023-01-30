package iframeProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrameProg1 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		WebElement timeButt = driver.findElement(By.xpath("//button[@type='button']"));
		timeButt.click();
		driver.switchTo().parentFrame();
		
		
		WebElement menuButt = driver.findElement(By.xpath("//a[@title='Open Menu']"));
		menuButt.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		WebElement timeButt1 = driver.findElement(By.xpath("//button[@type='button']"));
		Thread.sleep(2000);
		timeButt1.click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		driver.close();
		
	}
	
}
