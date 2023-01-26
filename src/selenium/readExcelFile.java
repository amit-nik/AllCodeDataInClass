package selenium;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class readExcelFile {


	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		WebElement fullnameTextbox = driver.findElement(By.xpath("//input[@id='fullname']"));
		WebElement emailIdTextbox = driver.findElement(By.xpath("//input[@id='emailid']"));
		WebElement passwordTextbox = driver.findElement(By.xpath("//input[@id='pass']"));				
		WebElement retypePassTextbox = driver.findElement(By.xpath("//input[@id='repass']"));
		WebElement genderRadioButton = driver.findElement(By.xpath("//input[@value='m']"));
		WebElement dayDropDown = driver.findElement(By.xpath("//select[@id='date_day']"));
		WebElement monDropDown = driver.findElement(By.xpath("//select[@id='date_mon']"));
		WebElement yearDropDown = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		WebElement locationTextBox = driver.findElement(By.xpath("//input[@id='signup_city']"));
		WebElement schoolTextBox = driver.findElement(By.xpath("//input[@id='school']"));
		WebElement clgTextBox = driver.findElement(By.xpath("//input[@id='college']"));
		WebElement captchaTextBox = driver.findElement(By.xpath("//input[@id='fld_captcha']"));
		
//		fullnameTextbox.sendKeys("Amit Tambe");
//		emailIdTextbox.sendKeys("Amit@gmail.com");
//		passwordTextbox.sendKeys("amit@1234");
//		retypePassTextbox.sendKeys("amit@1234");
		
//		but this is wrong practice because this is hard code pass. 
//		following method we pass sof code via excel sheet.
		
		FileInputStream file = new FileInputStream("\\Users\\tambe\\eclipse-workspace\\Practice\\TestData\\rediffData.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet2");
//		String value1 = excel.getRow(0).getCell(0).getStringCellValue();		
		
//		System.out.println(value1);
//		fullnameTextbox.sendKeys(value1);
		int i = 0;
		fullnameTextbox.sendKeys(excel.getRow(i).getCell(0).getStringCellValue());
		emailIdTextbox.sendKeys(excel.getRow(i).getCell(1).getStringCellValue());
		passwordTextbox.sendKeys(excel.getRow(i).getCell(2).getStringCellValue());
		retypePassTextbox.sendKeys(excel.getRow(i).getCell(3).getStringCellValue());
		genderRadioButton.click();
		
		Select s1 = new Select(dayDropDown);
		s1.selectByValue(excel.getRow(i).getCell(4).getStringCellValue());
		
		Select s2 = new Select(monDropDown);
		s2.selectByVisibleText(excel.getRow(i).getCell(5).getStringCellValue());
		
		Select s3 = new Select(yearDropDown);
		s3.selectByVisibleText(excel.getRow(i).getCell(6).getStringCellValue());
		
		locationTextBox.sendKeys(excel.getRow(i).getCell(7).getStringCellValue());
		schoolTextBox.sendKeys(excel.getRow(i).getCell(8).getStringCellValue());
		clgTextBox.sendKeys(excel.getRow(i).getCell(9).getStringCellValue());
		captchaTextBox.sendKeys(excel.getRow(i).getCell(10).getStringCellValue());
		
		Thread.sleep(2000);
		driver.close();
				
	}

}
