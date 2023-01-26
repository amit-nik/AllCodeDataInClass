package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators7 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		WebElement xyz = driver.findElement(By.tagName("input"));	
		xyz.sendKeys("Amar Kadam");
		Thread.sleep(2000);
		xyz.clear();
		Thread.sleep(2000);
		xyz.sendKeys("Amit Tambe");
		Thread.sleep(2000);
		
		driver.findElement(By.id("emailid")).sendKeys("amit@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("emailid")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("emailid")).sendKeys("amit@gmail.com");		
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Admin@1234");
		Thread.sleep(2000);
		driver.findElement(By.name("repass")).sendKeys("Admin@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='f']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sex")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("date_day")).sendKeys("18");
		Thread.sleep(2000);
		driver.findElement(By.name("date_mon")).sendKeys("AUG");
		Thread.sleep(2000);
		driver.findElement(By.name("Date_Year")).sendKeys("2007");
		Thread.sleep(2000);
		driver.findElement(By.id("signup_city")).sendKeys("Nagar");
		Thread.sleep(2000);
		driver.findElement(By.name("school")).sendKeys("SSMA");
		Thread.sleep(2000);
		driver.findElement(By.name("college")).sendKeys("Chhatapati Shivaji Maharaj Clg");	
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("rediff.com")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("r")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();		

		Thread.sleep(3000);
		driver.close();
	}
}
