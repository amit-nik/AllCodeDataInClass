package AutoSuggestionss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoSuggestionProg1 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("seleni");
		
		Thread.sleep(3000);
		
		List<WebElement> listSugg = driver.findElements(By.xpath("//div[@role='presentation']"));
		
		for(int i = 0; i<listSugg.size(); i++)
		{
			String AllList = listSugg.get(i).getText();
			System.out.println(AllList);
		}
		for(int i = 0; i<listSugg.size(); i++)
		{
			String expStr = "selenium download";
			String actStr = listSugg.get(i).getText();
			
			if(expStr.equals(actStr))
			{
				listSugg.get(i).click();
				break;
			}
		}
		//it push our code in git repositry.
		//pull latest code in our pc 
		driver.close();
	}

}
