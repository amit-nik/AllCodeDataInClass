package ActionClassProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHoldANDDragAndDropProg {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		WebElement imgTatras1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement imgTatras2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement imgTatras3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement imgTatras4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement trashBox = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		a.moveToElement(imgTatras1).clickAndHold().moveToElement(trashBox).release().build().perform();
		Thread.sleep(1000);
		a.moveToElement(imgTatras2).clickAndHold().moveToElement(trashBox).release().build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(imgTatras3, trashBox).build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(imgTatras4, trashBox).build().perform();
		
		Thread.sleep(5000);
		driver.close();
	}
	
}
