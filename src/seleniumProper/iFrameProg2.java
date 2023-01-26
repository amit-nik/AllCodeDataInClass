package seleniumProper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameProg2 {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		Thread.sleep(2000);
		driver.switchTo().frame("globalSqa");
		WebElement searchButton = driver.findElement(By.xpath("//header[@style='margin-top: 0px;']//input[@placeholder='Search...']"));
		searchButton.sendKeys("Amit Tambe");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement searchButton1 = driver.findElement(By.xpath("//div[@style='height: auto !important;']//input[@placeholder='Search...']"));
		searchButton1.sendKeys("Nik");
		Thread.sleep(2000);
		driver.switchTo().frame("globalSqa");
		WebElement searchButton2 = driver.findElement(By.xpath("//header[@style='margin-top: 0px;']//input[@placeholder='Search...']"));
		searchButton2.clear();
		searchButton2.sendKeys("Tambe");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		WebElement searchButton3 = driver.findElement(By.xpath("//div[@style='height: auto !important;']//input[@placeholder='Search...']"));
		searchButton3.clear();
		searchButton3.sendKeys("Karnjeet");
		Thread.sleep(2000);
		driver.close();
		
	}

}
