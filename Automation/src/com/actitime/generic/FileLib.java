package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * It is a generic class which contains generic methods for reading data from property, excel file
 * and write data into excel file
 * @author QSP
 */
public class FileLib {
/**
 * It is a generic method to read data from property file
 * @param key
 * @return value associated with the specified key in the form of String
 * @throws IOException
 */
public String readDataFromProperty(String key) throws IOException {
	FileInputStream fis =new FileInputStream("./data/commondata.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	String data = pobj.getProperty(key);
	return data;
}
/**
 * It is a generic method to read data from excel file
 * @param sheet
 * @param row
 * @param cell
@return It will return the String data present in specified sheet name , row index and cell index
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public String readDataFromExcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return data;
}
/**
 * It is a generic method to write data into specified cell
 * @param sheet
 * @param row
 * @param cell
 * @param value
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public void writeDataIntoExcel(String sheet,int row,int cell,String value) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	wb.write(fos);
}
}
