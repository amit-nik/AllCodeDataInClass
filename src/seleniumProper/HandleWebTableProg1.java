package seleniumProper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebTableProg1 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://money.rediff.com/index.html");
		driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");
		
//		List<WebElement> hmtTable = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']"));
//		for(int i=0;i<hmtTable.size();i++)
//			System.out.println(hmtTable.get(i).getText());
//		Thread.sleep(2000);
//		driver.close();
		
		driver.findElement(By.xpath("//a[@id='showMoreLess']")).click();
		
		List<WebElement> hmtTable1 = driver.findElements(By.xpath("//table[@class='dataTable']"));
		for(int i=0;i<hmtTable1.size();i++)
			System.out.println(hmtTable1.get(i).getText());
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
