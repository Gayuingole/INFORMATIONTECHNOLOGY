package exelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exelreadingeg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File Myile = new File("E:\\New folder\\5thmarch.xlsx");
		 Sheet mysheet = WorkbookFactory.create(Myile).getSheet("Sheet2");
		 int lastrownum = mysheet.getLastRowNum();
	        int totalrowcount = lastrownum;
	       int lastcellnum = mysheet.getRow(0).getLastCellNum();
	       int totalcellcount= lastcellnum;
	       System.out.println(totalrowcount);
	       //when total row count is 4 for loop read as lenght 4 
	       //BUT WHERE WE WANT TO PRINT WITH INDEXWE ADD TOTALROWCOUNT+1
	       // BECAUSE ROW START FROM 0 COULMCELL START FROM 1 
	       for(int i= 0; i<totalrowcount+1;i++) {
	    	  String text = mysheet.getRow(i).getCell(0).getStringCellValue();
	    	  System.out.println(text);
	       }
	}

}
