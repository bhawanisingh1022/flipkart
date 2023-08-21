package day33;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writting {
	public static void main(String args[]) throws IOException
	{
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\test_data\\ch.xlsx") ;
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		XSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("jyoti");
		row.createCell(1).setCellValue("parth");
		row.createCell(2).setCellValue("babu");
		row.createCell(3).setCellValue("bhawani");
		XSSFRow row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue("asha");
		row1.createCell(1).setCellValue("kp");
		row1.createCell(2).setCellValue("bhawani");
		row1.createCell(3).setCellValue("devender");
		XSSFRow row2 = sheet.createRow(2);
		row2.createCell(0).setCellValue("nisha");
		row2.createCell(1).setCellValue("guddu");
		row2.createCell(2).setCellValue("pari");
		row2.createCell(3).setCellValue("kp");
		
		workbook.write(file);
		
		workbook.close();
		file.close();
		System.out.println("writting is done");
		
		
	}

}
