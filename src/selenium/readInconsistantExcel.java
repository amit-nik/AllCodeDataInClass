package selenium;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readInconsistantExcel {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\tambe\\eclipse-workspace\\Practice\\TestData\\rediffData.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet4");	
		
		for(int row=0; row<=excel.getLastRowNum(); row++)
		{
			for(int col=0; col<excel.getRow(row).getLastCellNum(); col++)
			{
				String v = excel.getRow(row).getCell(col).getStringCellValue();
				System.out.print(v+"\t");
			}
			System.out.println();
		}
		System.out.println("****************");
		System.out.println(excel.getLastRowNum());
		System.out.println(excel.getRow(0).getLastCellNum());
	}

}
