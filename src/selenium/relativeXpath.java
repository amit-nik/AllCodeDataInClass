package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativeXpath { 

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys("AMIT TAMBE");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='emailid']")).sendKeys("amit@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Amit@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='repass']")).sendKeys("Amit@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='f']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sex")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("date_day")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='08']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("date_mon")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='AUG']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Date_Year")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='2007']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Nagar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'school')]")).sendKeys("SSMA");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='college']")).sendKeys("Chhatapati Shivaji Maharaj Clg");
		Thread.sleep(2000);
		driver.findElement(By.linkText("rediff.com")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(4000);
		driver.close();
	
	}
}