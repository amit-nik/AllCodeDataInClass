package seleniumProper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleEelementProg1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("Number of links = " +links.size());
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		for(int i=0; i<links.size(); i++)
		{
			 String expecstr = "About";
			 String actustr = links.get(i).getText();
			 if(expecstr.equals(actustr))
			 {
				 links.get(i).click();
				 break;
			 }
		}
		System.out.println("current title = " + driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}

}
