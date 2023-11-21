package darshanseries.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExcelUtil {
	public static final String TEST_DATA_SHEET_PATH= "./src/test/resource/testdate/logintestdata.xlsx";
//	private static Workbook book; 
//	private static Sheet sheet;

	
//	public static Object[][] getTestData(String sheetname)
//	{
//		System.out.println("reading the data from the sheet"+sheetname);
//		Object data[][]=null;
//		try {
//			FileInputStream ip = new FileInputStream(TEST_DATA_SHEET_PATH);
//			book=WorkbookFactory.create(ip);
//			sheet=book.getSheet(sheetname);
//			data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
//			for(int i=0; i<sheet.getLastRowNum();i++)
//			{
//				for(int j=0; j<sheet.getRow(0).getLastCellNum();j++)
//				{
	//				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
	//			}
	//		}
	//			
	//	} catch (FileNotFoundException e) {
			
	//		e.printStackTrace();
	//	} catch (EncryptedDocumentException e) {
	//		
	//		e.printStackTrace();
	//	} catch (IOException e) {
	//		
	//		e.printStackTrace();
	//	}
	//	return data;
	//}
	
	public static void  getTestData(String sheetName) throws IOException
	{
		FileInputStream fs = new FileInputStream(TEST_DATA_SHEET_PATH);
		//Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		XSSFRow row1 = sheet.getRow(1);
		XSSFCell cell1 = row1.getCell(1);
		System.out.println(sheet.getRow(0).getCell(1));
		XSSFRow row2 = sheet.getRow(1);
		XSSFCell cell2 = row2.getCell(1);
		System.out.println(sheet.getRow(1).getCell(0));
		XSSFRow row3 = sheet.getRow(1);
		XSSFCell cell3 = row3.getCell(1);
		System.out.println(sheet.getRow(1).getCell(1));
		//String cellval = cell.getStringCellValue();
		//System.out.println(cellval);
		
		}

	



	
	
	

}