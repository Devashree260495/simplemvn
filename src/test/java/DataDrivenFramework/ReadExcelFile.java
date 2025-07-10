package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	public static void readExcel() throws IOException {
		FileInputStream file= new FileInputStream("D:\\Devashree\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("TestData");
//		workbook.getSheetAt(0);
		String data=sheet.getRow(3).getCell(0).getStringCellValue();
		System.out.println(data);
		int noOfRows=sheet.getLastRowNum();
		System.out.println(noOfRows);
		int noOfCol=sheet.getRow(0).getLastCellNum();
		System.out.println(noOfCol);
	}
	public static void main(String[] args) throws IOException {
		ReadExcelFile.readExcel();
	}
	

}
