package exelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exelreading5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File Myile = new File("E:\\New folder\\5thmarch.xlsx");
		 Sheet mysheet = WorkbookFactory.create(Myile).getSheet("Sheet3");
		int totalrowcount = mysheet.getLastRowNum()+1;
		for(int i=0;i<totalrowcount;i++)//for lopp controlstament check the numberof
			//-totalrow count (for loop control statement cant read inedx number)
			
		
		{
			String text = mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(text);
			//here get row and get cell knows the index number
		}

		 
	}

}
