package selenium;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readExceFile {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\tambe\\eclipse-workspace\\Practice\\TestData\\rediffData.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet3");
		
		for(int row=0 ; row<4; row++)
		{
			for(int col=0 ; col<3 ; col++ )
			{
				String v = excel.getRow(row).getCell(col).getStringCellValue();
				System.out.print(v + "    \t");
			}
			System.out.println();
		}
	}

}
