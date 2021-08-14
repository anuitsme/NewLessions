package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelProvider {

	private static String TestDataPath="D:\\Education\\Selenium Workspace\\NewLessons\\TestData.xlsx";
	private static Workbook book;
	private static FileInputStream fis=null;
	
	public static Sheet getSheet(String sheetName) {
		//FileInputStream fis=null;
		try {
			fis=new FileInputStream(TestDataPath);
			
		}catch(FileNotFoundException e) {e.printStackTrace();}
		
		try {
			 book=WorkbookFactory.create(fis);
		}catch(InvalidFormatException e) {e.printStackTrace();}
		catch (IOException e) {e.printStackTrace();}
		
		Sheet sheet=book.getSheet(sheetName);
		//System.out.println(sheet.getLastRowNum());
		return sheet;
		
	}
	
	public static ArrayList<Object[]> getSignUpData(String sheetName) {
		
		
		Sheet sheet=getSheet(sheetName);
		//System.out.println(sheet.getLastRowNum());
		ArrayList<Object[]> arr= new ArrayList<Object[]>();
		
		for(int i=1;i<=sheet.getLastRowNum();i++) {
			String fname=sheet.getRow(i).getCell(0).getStringCellValue();
			String lname=sheet.getRow(i).getCell(1).getStringCellValue();
			
			
			Double det=sheet.getRow(i).getCell(2).getNumericCellValue();
			String phone=String.valueOf(det);
			phone=phone.replace(".","");
			phone=phone.replace("E9", "");
			//System.out.println(det);
			String email=sheet.getRow(i).getCell(3).getStringCellValue();
			String customer=sheet.getRow(i).getCell(4).getStringCellValue();
			String password=sheet.getRow(i).getCell(5).getStringCellValue();
			arr.add(new Object[] {fname,lname,phone,email,customer,password});
			
			
		}
		try {
			fis.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return arr;
		
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		ArrayList<Object[]> arr=getSignUpData("SignUp");
		for(Object[] data:arr) {
			System.out.println(data[3]);
		}
		
	
	
	
	}
	
}
