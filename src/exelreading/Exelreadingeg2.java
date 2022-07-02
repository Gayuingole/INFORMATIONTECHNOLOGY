package exelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exelreadingeg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File Myile = new File("E:\\New folder\\5thmarch.xlsx");
		 Sheet mysheet = WorkbookFactory.create(Myile).getSheet("Sheet2");
		 //STATIC CODING //READING WHOLE ROW
		// for(int i=0;i<4;i++)
		// {
//			  String text = mysheet.getRow(2).getCell(i).getStringCellValue();
//			 System.out.println(text);
//		 }
		 //DYNAMIC CODING
		 int lastrownum = mysheet.getLastRowNum();
	        int totalrowcount = lastrownum;
	       int lastcellnum = mysheet.getRow(0).getLastCellNum();
	       int totalcellcount= lastcellnum;
	       System.out.println(totalcellcount);
	       System.out.println(totalrowcount);
          for(int i=0; i<totalcellcount;i++) {
        String text2 = mysheet.getRow(2).getCell(i).getStringCellValue();
        System.out.println(text2);
        
          }
	}

	
}
