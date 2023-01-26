package HandleMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googlePageElementProg {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		List<WebElement> googleLink = driver.findElements(By.xpath("//a"));
//		System.out.println(googleLink);
		
		for(int i = 0; i < googleLink.size(); i++)
		{
			String allEle = googleLink.get(i).getText();
			System.out.println(allEle);
		}
		for(int i = 0; i<googleLink.size(); i++)
		{
			String expStr = "Images";
			String actStr = googleLink.get(i).getText();
			
			if(expStr.equals(actStr))
			{
				googleLink.get(i).click();
				break;
			}
		}
		System.out.println("Current Page Tittle = " + driver.getTitle());
		System.out.println("Current Page URL = " + driver.getCurrentUrl());
		
		driver.close();
		
	}

}
