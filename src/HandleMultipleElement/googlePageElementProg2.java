package HandleMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googlePageElementProg2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement userId = driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement userPass = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		
		
		userId.sendKeys("standard_user");
		userPass.sendKeys("secret_sauce");
		loginButton.click();
		List<WebElement> inventryLink = driver.findElements(By.xpath("//a"));
		for(int i = 0; i<inventryLink.size(); i++)
		{
			String allLinks = inventryLink.get(i).getText();
			System.out.println(allLinks);
		}
		
		for(int i = 0; i<inventryLink.size(); i++)
		{
			String actStr = inventryLink.get(i).getText();
			String expStr = "Sauce Labs Bolt T-Shirt";
			
			if(expStr.equals(actStr))
			{
				inventryLink.get(i).click();
				break;
			}
		}
		
		System.out.println("Current Page URL = " + driver.getCurrentUrl());
		System.out.println("Current Page Tittle = " + driver.getTitle());
		
		driver.close();
		
	}

}
