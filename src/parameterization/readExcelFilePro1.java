package parameterization;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readExcelFilePro1 {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("C:\\\\Users\\\\tambe\\\\eclipse-workspace\\\\Practice\\\\TestData\\\\rediffData.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet3");
		
		for(int i = 0; i<4; i++)
		{
			for(int j = 0; j<3; j++)
			{
				String v = excel.getRow(i).getCell(j).getStringCellValue();
				System.out.print(v + "		");
			}
			System.out.println();
		}
	}
}
	

