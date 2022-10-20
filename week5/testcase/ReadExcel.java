package week5.day1testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcel(String ExcelFileName) throws IOException {
		
		XSSFWorkbook wbook = new XSSFWorkbook("data/"+ExcelFileName+".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);//read the first sheet
		//From the sheet get the total number of rows(getLastRowNum)
		int rowCount = sheet.getLastRowNum();
		System.out.println("Total number of rows : "+rowCount);
		//From the sheet get the 1st row and find the column count(getLastCellNum)
		short columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Total number of columns : "+columnCount);
		String[][] data = new String[rowCount][columnCount];
		//iterate through each row
		
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			//iterate through  each cell of the rows
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				//read the data (getStringCellValue)
				String stringCellValue = cell.getStringCellValue();
				//print the data
				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;
				
			}
			
		}
		
		wbook.close();
		return data;
		

	}

}
