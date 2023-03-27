package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://en.wikipedia.org/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(1000);

		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		System.out.println(driver.getTitle());
		String currUrl = driver.getCurrentUrl();
		System.out.println(currUrl);
		String expTitle = "Rediff.com";
		if(expTitle.equals(actTitle))
		System.out.println("Title - Test case pass");
		else
		System.out.println("Title - Test case failed");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(2000);
		Dimension d = new Dimension(500, 300);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		Point p = new Point(10, 700);
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
		// amit
	}
	

	
}
