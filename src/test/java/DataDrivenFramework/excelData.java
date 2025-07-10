package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelData {
public static void readMulplData() throws IOException {
	DataFormatter df=new DataFormatter();
	FileInputStream file=new FileInputStream("D:\\Devashree\\TestData.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("TestData");
	int NoOfRows=sheet.getLastRowNum();
	System.out.println(NoOfRows);
	int NoOfCol=sheet.getRow(0).getLastCellNum();
	System.out.println(NoOfCol);
	for(int i=0;i<=NoOfRows;i++) {
		XSSFRow row=sheet.getRow(i);
		for(int j=0;j<=NoOfCol;j++) {
			XSSFCell cell=row.getCell(j);
			String data=df.formatCellValue(cell);
			System.out.println(data+" ");
		}
		System.out.println();
	}
	
}
public static void main(String[] args) throws IOException {
	excelData.readMulplData();
}
}

