package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class HandlingExcelFile {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
//In order to read the data from external file we need to create an object of FileInputStream	
//which will convert the data from human understandable lang to binary lang
//We need to pass rel path of the file as a parameter in order to execute it in multiple systems
  FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
//To read the data from excel we need to create an object of Workbook interface type.To create the 
//obj we make use of create() which is a static method present in WorkbookFactory class. It will
//create the object of Workbook interface type and also load the data since it takes fis reference
  Workbook wb = WorkbookFactory.create(fis);
//With the object reference first we need to get the sheet from which data should be fetched, then
//we need to get the row,then get the specific cell and then get the data using getStringCellValue()
	int data = (int)wb.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
	System.out.println(data);
}
}
