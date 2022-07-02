package exelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exelreadingex1 { 

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File Myile = new File("E:\\New folder\\5thmarch.xlsx");
        String name = WorkbookFactory.create(Myile).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
        System.out.println(name);
        String Myfile2 = WorkbookFactory.create(Myile).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
        System.out.println(Myfile2);
        double myfile3 = WorkbookFactory.create(Myile).getSheet("sheet1").getRow(1).getCell(0).getNumericCellValue();
        System.out.println(myfile3);
      String myfile4 = WorkbookFactory.create(Myile).getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
        System.out.println(myfile4);
        double myfile5 = WorkbookFactory.create(Myile).getSheet("sheet1").getRow(2).getCell(0).getNumericCellValue();
        System.out.println(myfile5);
         String myfile6 = WorkbookFactory.create(Myile).getSheet("sheet1").getRow(2).getCell(1).getStringCellValue();
        System.out.println(myfile6);
        double myfile7 = WorkbookFactory.create(Myile).getSheet("sheet1").getRow(2).getCell(2).getNumericCellValue();
        System.out.println(myfile7);
        
	}

}