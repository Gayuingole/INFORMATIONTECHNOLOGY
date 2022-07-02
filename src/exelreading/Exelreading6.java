package exelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exelreading6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File Myile = new File("E:\\New folder\\5thmarch.xlsx");
		 Sheet mysheet = WorkbookFactory.create(Myile).getSheet("Sheet4");
		int totalrowcount = mysheet.getLastRowNum();
		int totalcellcount = mysheet.getRow(totalrowcount).getLastCellNum()-1;
		 System.out.println(totalrowcount);
		  
		  for(int i=0;i<=totalrowcount;i++) {
			  for(int j=0;j<=totalcellcount;j++) {
			Cell cell = mysheet.getRow(i).getCell(j);
			  CellType type = cell.getCellType();
			  
			  
		  if(type==CellType.STRING)
			  {
		  System.out.print(cell.getStringCellValue()+" ");
			}
		  else if(type==CellType.NUMERIC) {
			  System.out.print(cell.getNumericCellValue()+" ");
		  }
		  else if(type==CellType.BOOLEAN) {
			  System.out.print(cell.getBooleanCellValue()+" ");
		  }
		  else if(type==CellType.BLANK) {
			  System.out.print(" == ");
		
		  }	  
			  
		  }
			  System.out.println();
	}}
	}
