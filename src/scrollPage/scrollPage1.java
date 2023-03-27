package scrollPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollPage1 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement elem = driver.findElement(By.xpath("//a[text()='Brand Directory']"));
		Thread.sleep(3000);
		JavascriptExecutor a =((JavascriptExecutor)driver);
		a.executeScript("window.scrollBy(0,500)");
		
		
//		1).How to scroll down on a web page in Selenium by defining the number of pixels
//		to perform Scroll on application using Selenium
//		        JavascriptExecutor a = (JavascriptExecutor) driver;
//		a.executeScript("window.scrollBy(0,350)", "");
		
//		How to scroll down to the bottom of the webpage using Selenium?
//		to perform scroll on an application using Selenium
//		   		JavascriptExecutor js = (JavascriptExecutor) driver;
		 		a.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
//		3).How to scroll down to an element in Selenium until it is visible
//		Scrolling down the page till the element is found		
        		a.executeScript("arguments[0].scrollIntoView();", elem);
		
//		4).How to scroll horizontally on a web page to a specific web element using Selenium
//		This will scroll the page Horizontally till the element is found
//		         js.executeScript("arguments[0].scrollIntoView();", elem);
		
		Thread.sleep(3000);
		driver.close();
	}

}
