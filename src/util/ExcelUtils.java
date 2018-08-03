package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;
    private static XSSFRow Row;
    private static String[][] tabArray;

    public static void setExcelFile(String Path,String SheetName) throws Exception {

    	try {
    		FileInputStream ExcelFile = new FileInputStream(Path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
				}
       	catch (Exception e){
				throw (e);
			}
		}

  
    	public static String getCellData(int RowNum, int ColNum) throws Exception{
       		try{
          		Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
          		if(Cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
          	        Cell.setCellType(Cell.CELL_TYPE_STRING);
          		}
          		String CellData = Cell.getStringCellValue();
          		return CellData;
          		}
       		catch (Exception e){
					return"";
          		}
		}
    	    
    	public static Object[][] getTableArray(String Path,String SheetName) throws Exception{
    	    setExcelFile(Path, SheetName);
    	    int ci,cj;
    	    tabArray = new String[7][2];
    	    ci = 0;
    	    for(int i = 0; i < 7; i++,ci++) {
    	    	cj = 0;
    	    	for(int j = 0; j < 2; j++,cj++) {
    	    		tabArray[ci][cj] = getCellData(i,j);
    	    	}
    	    }
    	    	
    	    return (tabArray) ;
    	}

}