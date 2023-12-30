package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AnotherWayOfReadDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet s = wb.getSheet("Sheet1");
	Row r = s.getRow(1);
	Cell c = r.getCell(2);
	String data = c.getStringCellValue();
	System.out.println(data);
	wb.getSheet("Sheet1").getRow(1).getCell(2).setCellValue("Dinga");
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	wb.write(fos);
	wb.close();
}
}
