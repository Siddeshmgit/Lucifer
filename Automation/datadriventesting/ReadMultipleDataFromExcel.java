package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	int count = wb.getSheet("InvalidLogin").getLastRowNum();
	//getLastRowNum() is used to fetch the index of last row which is having the data.
	System.out.println(count);
	for(int i=1;i<=count;i++) {
		String un = wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
		String pwd = wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
		System.out.println("Username: "+un+" Password: "+pwd);
	}
	int lastcell = wb.getSheet("Sheet1").getRow(1).getLastCellNum();//Return type is short.
	System.out.println(lastcell);
	for(int i=0;i<lastcell;i++) {
		String data = wb.getSheet("Sheet1").getRow(0).getCell(i).getStringCellValue();
		System.out.println(data);
	}
}
}
