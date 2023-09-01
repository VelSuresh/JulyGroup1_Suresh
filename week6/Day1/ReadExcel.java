package group1.week6.Day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 

{
	
public static String[][] readExcel() throws IOException {
		
		XSSFWorkbook book = new XSSFWorkbook("./data/CreateLead.xlsx");
		XSSFSheet sheetAt = book.getSheetAt(0);
		XSSFRow row = sheetAt.getRow(2);
		int rowCount = sheetAt.getLastRowNum();
		int colCount = row.getLastCellNum();
		
		
		String[][] data=new String[rowCount][colCount];
		
		for(int i=1;i<=rowCount;i++) 
		{
			
			for(int j=0;j<colCount;j++)
			{				
				//Testleaf=getRow(1).getCell(0)
				String cellValues = sheetAt.getRow(i).getCell(j).getStringCellValue();
				
				//Data we read from excelSheet needs to be pushed into 2 Dimensional array, to Store & access it.
				//only header row value we are ignoring & hence we are giving  i-1 in row & not in columnn value
				
				
				//data[i][j]=cellValues;
				//data[1][0]=Testleaf;
				//dat[0][0]=Testleaf
				//i-1 right, since i =1	
				//we get from row 1 in excel, in array we need to store as 0 th index
				
				//Data we read from excelSheet needs to be pushed into Two Dimensional Array
			   data[i-1][j]=cellValues;
			   System.out.println(cellValues);
			   
			}
			
		}	
		
		//close the book (Mandatory step)
		
		book.close();
		return data;
	}
public static String[][] editExcel() throws IOException {
	
	XSSFWorkbook book = new XSSFWorkbook("./data/EditLead.xlsx");
	XSSFSheet sheetAt = book.getSheetAt(0);
	XSSFRow row = sheetAt.getRow(2);
	int rowCount = sheetAt.getLastRowNum();
	int colCount = row.getLastCellNum();
	
	System.out.println("The values of Edit Excel are");
	
	
	String[][] data=new String[rowCount][colCount];
	
	for(int i=1;i<=rowCount;i++) 
	{
		
		for(int j=0;j<colCount;j++) 
		{				
			//Testleaf=getRow(1).getCell(0)
			String cellValues = sheetAt.getRow(i).getCell(j).getStringCellValue();
			
			//Data we read from excelSheet needs to be pushed into 2 Dimensional array, to Store & access it.
			//only header row value we are ignoring & hence we are giving  i-1 in row & not in columnn value
			
			
			//data[i][j]=cellValues;
			//data[1][0]=Testleaf;
			//dat[0][0]=Testleaf
			//i-1 right, since i =1	
			//we get from row 1 in excel, in array we need to store as 0 th index
			
			//Data we read from excelSheet needs to be pushed into Two Dimensional Array
		   data[i-1][j]=cellValues;
		   System.out.println(cellValues);
		   
		}
		
	}	
	
	//close the book (Mandatory step)
	
	book.close();
	return data;
}
	
public static String[][] deleteExcel() throws IOException {
	
	XSSFWorkbook book = new XSSFWorkbook("./data/DeleteLead.xlsx");
	XSSFSheet sheetAt = book.getSheetAt(0);
	XSSFRow row = sheetAt.getRow(2);
	int rowCount = sheetAt.getLastRowNum();
	int colCount = row.getLastCellNum();
	
	System.out.println("The values of Delete Excel are");
	
	
	String[][] data=new String[rowCount][colCount];
	
	for(int i=1;i<=rowCount;i++) 
	{
		
		for(int j=0;j<colCount;j++) 
		{				
			//Testleaf=getRow(1).getCell(0)
			String cellValues = sheetAt.getRow(i).getCell(j).getStringCellValue();
			
			//Data we read from excelSheet needs to be pushed into 2 Dimensional array, to Store & access it.
			//only header row value we are ignoring & hence we are giving  i-1 in row & not in columnn value
			
			
			//data[i][j]=cellValues;
			//data[1][0]=Testleaf;
			//dat[0][0]=Testleaf
			//i-1 right, since i =1	
			//we get from row 1 in excel, in array we need to store as 0 th index
			
			//Data we read from excelSheet needs to be pushed into Two Dimensional Array
		   data[i-1][j]=cellValues;
		   System.out.println(cellValues);
		   
		}
		
	}	
	
	//close the book (Mandatory step)
	
	book.close();
	return data;
}
	
	
	public static void main(String[] args) throws IOException 
	
	{
		readExcel();
		editExcel();
		deleteExcel();
		
		
	}
	

}
