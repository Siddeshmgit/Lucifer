package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintIntValueFromExcelFile {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	double slno = wb.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
	System.out.println(slno);
	int slno1 = (int)wb.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
	System.out.println(slno1);
}
}
