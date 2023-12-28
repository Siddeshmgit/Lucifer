package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
//getLastRowNum() is used to fetch the index of last row which is having the data in a sheet
	int count = wb.getSheet("InvalidLogin").getLastRowNum();
	System.out.println(count);
	for(int i=1;i<=count;i++) {
	String un = wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
	String pwd = wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
	System.out.println("Username: "+un+" password: "+pwd);
	}
//getLastCellNum() is used to fetch the number of cell containing values in a row
	int lastCell=wb.getSheet("Sheet1").getRow(1).getLastCellNum();
	System.out.println(lastCell);
	for(int i=0;i<lastCell;i++) {
		String data = wb.getSheet("Sheet1").getRow(1).getCell(i).getStringCellValue();
		System.out.println(data);
	}
}
}
