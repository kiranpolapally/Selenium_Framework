package utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Fucntion {

	
	String FilePath = "uploadfiles//sample.xlsx";

	public void ExcelRead(String SheetName, int row, int Column) throws Exception{
	
	DataFormatter d = new DataFormatter();
	FileInputStream fi = new FileInputStream(FilePath); 
	XSSFWorkbook wb = new XSSFWorkbook(fi);  //xlsx format
	XSSFSheet sh = wb.getSheet(SheetName); // sheet name
	XSSFRow r = sh.getRow(row);  //row
	String cellvalue = d.formatCellValue(r.getCell(Column));  // column
	System.out.println("cellvalue  "+cellvalue);
	wb.close();
	fi.close();

	}
	
	

}

