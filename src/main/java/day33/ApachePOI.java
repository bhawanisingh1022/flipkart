package day33;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApachePOI {
public static void main(String args[]) throws IOException
{
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\test_data\\data.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("sheet1");
	int totalrow = sheet.getLastRowNum();
	int totalcell = sheet.getRow(1).getLastCellNum();
	for(int r=0;r<=totalrow;r++)
	{
		sheet.getRow(r);
		for(int c=0;c<totalcell;c++)
		{
			String value = sheet.getRow(r).getCell(c).toString();
			System.out.print(value+ "   ");
		}
		System.out.println();
	}
	
	
	
	workbook.close();
	file.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
}
