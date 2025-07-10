package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class excelDatawithTestNG {
@DataProvider(name="excelData")
public static Object[][] readExcel() throws IOException {
	DataFormatter df=new DataFormatter();
	FileInputStream file=new FileInputStream("D:\\Devashree\\TestData.xlsx");
	XSSFWorkbook workbook= new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("TestData");
	int Totalrows=sheet.getLastRowNum();
	int Totalcol=sheet.getRow(0).getLastCellNum();
	Object obj[][]=new Object[Totalrows][Totalcol];
	for(int i=1;i<=Totalrows;i++) {
		XSSFRow row=sheet.getRow(i);
		for(int j=0;j<Totalcol;j++) {
		XSSFCell cell=row.getCell(j);
		obj [i-1][j]=df.formatCellValue(cell);
		}
	}
	return obj;
	
}
@Test(dataProvider="excelData")
public void testExcelData(String V1, String V2) {
	System.out.println(V1+"  "+V2);
}
	
}
