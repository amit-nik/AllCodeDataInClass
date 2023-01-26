package HandleWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleWebTableProg1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");
		
		List<WebElement> webTable1 = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		List<WebElement> tableHead = driver.findElements(By.xpath("//tr//th"));
		driver.findElement(By.xpath("//a[@id='showMoreLess']")).click();
	
		
		for(WebElement value : tableHead)
		{
			String str = value.getText();
			System.out.print(str + "\t");
		}
		System.out.println();
		for(WebElement value : webTable1)
		{
			String str = value.getText();
			System.out.println(str);
		}
		driver.close();
		
		
	}

}
