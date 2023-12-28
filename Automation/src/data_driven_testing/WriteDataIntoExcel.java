package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
//In order to set the data in to the the cell we should use setCellValue(String value)
	wb.getSheet("Sheet1").getRow(1).getCell(5).setCellValue("Fail");
//In order to convert the set value into human understandable type we should create an
//object of FileOutputStream and specify the path of the file 
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
//In order to write the data to excel we should use write(OutputStream) present in 
//Workbook interface
	wb.write(fos);
	wb.close();
}
}
