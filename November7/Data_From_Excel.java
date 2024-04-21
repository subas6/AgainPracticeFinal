package com.November7;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_From_Excel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("C:\\Automation\\testdata.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet("Sheet1");
	String data1=sh.getRow(0).getCell(1).getStringCellValue();
	System.out.println(data1);
	double data2=sh.getRow(1).getCell(0).getNumericCellValue();
	System.out.println(data2);
}
}
