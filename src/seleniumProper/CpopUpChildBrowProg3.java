package seleniumProper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class CpopUpChildBrowProg3 {
	
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "chromedriver_win32/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("http://www.popuptest.com/goodpopups.html");

			driver.findElement(By.linkText("Good PopUp #3")).click();

			Set<String> handles = driver.getWindowHandles();

			Iterator<String> it = handles.iterator();

			String parentWindowID = it.next();
			System.out.println("parent window id is : " + parentWindowID);

			String childWindowID = it.next();
			System.out.println("child pop up window id is : " + childWindowID);

			driver.switchTo().window(childWindowID);

			System.out.println("child window title is " + driver.getTitle());

			driver.close();

			driver.switchTo().window(parentWindowID);
			System.out.println("parent window title is " + driver.getTitle());
		}
}
