package Utility;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	
	public static String readExcelFile(int row,int col)throws Exception
	{
		FileInputStream file=new FileInputStream("C:\\eclipse\\Frame1\\TestData\\Login.xlsx");
		Sheet excelFile=WorkbookFactory.create(file).getSheet("Sheet1");
		String value=excelFile.getRow(row).getCell(col).getStringCellValue();
		return value;
	}

}
