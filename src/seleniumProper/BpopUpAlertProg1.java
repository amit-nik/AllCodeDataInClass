package seleniumProper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BpopUpAlertProg1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space(text())='click the button to display an alert box:']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		Thread.sleep(3000);
		Alert y = driver.switchTo().alert();
		System.out.println(y.getText());
		y.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		Thread.sleep(5000);
		Alert z = driver.switchTo().alert();
		System.out.println(z.getText());
		z.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		a.sendKeys("this is send key box");
		System.out.println(a.getText());
		a.accept();
		Thread.sleep(3000);
		
		driver.close();		
	}

}
