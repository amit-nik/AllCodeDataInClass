package seleniumProper;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CpopUpChildBrowProg1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		
//		driver.findElement(By.xpath("//input[@value='Open Popup']")).click();
//		Set<String> window = driver.getWindowHandles();
//		
//		Iterator itr = window.iterator();
//		System.out.println("All Window");
////		while(itr.hasNext()) {
////			System.out.println(itr.next());
////		}
//		System.out.println("total number of window = "+window.size());
//		
//		String win[] = new String[3];
//		for(int i=0;i<window.size();i++)
//		{
//		win[i] = (String) itr.next();
//		System.out.println(win[i]);
//		}
//		driver.switchTo().window(win[1]);
//		driver.manage().window().maximize();
//		 String text1 = driver.findElement(By.xpath("//table")).getText();
//		 System.out.println(text1);
//		driver.manage().window().minimize();
//		Thread.sleep(5000);
//		driver.close();
//		driver.switchTo().window(win[0]);
//		driver.close();
	}

}
