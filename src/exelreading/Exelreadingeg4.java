package exelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exelreadingeg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File Myile = new File("E:\\New folder\\5thmarch.xlsx");
		 Sheet mysheet = WorkbookFactory.create(Myile).getSheet("Sheet2");
        //READ TOTAL SHEET USING STATIC CODING
		for(int i=0; i<=4;i++) {
			for(int j= 0;j<=3;j++) {
			 String text = mysheet.getRow(i).getCell(j).getStringCellValue();
				 System.out.print(text+" ");
				 
			 }
			 System.out.println();
		 }
	}

}
