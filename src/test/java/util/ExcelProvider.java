package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelProvider {

	private static String TestDataPath="";
	private static Workbook book;
	private static FileInputStream fis=null;
	
	public static Sheet getLoginSheet(String sheetName) {
		//FileInputStream fis=null;
		try {
			fis=new FileInputStream(TestDataPath);
			
		}catch(FileNotFoundException e) {e.printStackTrace();}
		
		try {
			 book=WorkbookFactory.create(fis);
		}catch(InvalidFormatException e) {e.printStackTrace();}
		catch (IOException e) {e.printStackTrace();}
		
		Sheet sheet=book.getSheet(sheetName);
		
		return sheet;
		
	}
	
	public static ArrayList<Object[]> getSignUpData(String sheetName) {
		
		
		Sheet sheet=getLoginSheet(sheetName);
		ArrayList<Object[]> arr= new ArrayList<Object[]>();
		
		for(int i=2;i<=sheet.getLastRowNum();i++) {
			String fname=sheet.getRow(i).getCell(1).toString();
			String lname=sheet.getRow(i).getCell(2).toString();
			String phone=sheet.getRow(i).getCell(3).toString();
			String email=sheet.getRow(i).getCell(4).toString();
			String customer=sheet.getRow(i).getCell(5).toString();
			String password=sheet.getRow(i).getCell(6).toString();
			arr.add(new Object[] {fname,lname,phone,email,customer,password});
			
			
		}
		try {
			fis.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return arr;
		
	}
	
}
