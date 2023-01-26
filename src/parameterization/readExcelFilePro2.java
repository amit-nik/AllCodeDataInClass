package parameterization;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readExcelFilePro2 {

	public static void main(String[] args) throws Exception{
	
		FileInputStream file = new FileInputStream("C:\\Users\\tambe\\eclipse-workspace\\Practice\\TestData\\rediffData.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet4");
		
		for(int i = 0; i<excel.getLastRowNum(); i++)
		{
			for(int j = 0; j<excel.getRow(i).getLastCellNum(); j++)
			{
				String value = excel.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value + "\t");
			}
			System.out .println();
		}
		
	}

}
