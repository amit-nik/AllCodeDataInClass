package waitType;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitWaitProg {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		Implicit wait use for the all webElement present in th webpage.
//		if webElement not found given time then they will throw exception.
//		Inplicit wait declare globaly once then not require use other waits.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("seleni");
		List<WebElement> autoSugEle =  driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		for(int i=1;i<autoSugEle.size();i++)
		{
			System.out.println(autoSugEle.get(i).getText());		
		}
		
		for(int i=1;i<autoSugEle.size();i++)
		{
			if(autoSugEle.get(i).getText().equals("selenium webdriver"));
				autoSugEle.get(i).click();
				break;
		}
		
		driver.close();
		
		
		
	}



}
