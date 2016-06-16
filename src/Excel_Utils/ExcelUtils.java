package Excel_Utils;


import java.io.FileInputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;
    private static XSSFRow Row;
public static void setExcelFile(String Path) throws Exception {
       try {
        FileInputStream ExcelFile = new FileInputStream(Path);
        ExcelWBook = new XSSFWorkbook(ExcelFile);
        } catch (Exception e){
            throw (e);
        }
}

public static String getCellData(String sheetName, String colName, int rowNum){
	try{
		if(rowNum<=0)
			return"";
		
		int index=ExcelWBook.getSheetIndex(sheetName);
		int col_Num=-1;
			if(index==-1)
				return"";
			
		ExcelWSheet=ExcelWBook.getSheetAt(index);
		Row=ExcelWSheet.getRow(0);
			for(int i=0; i<Row.getLastCellNum(); i++){
				if(Row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
					col_Num=i;
			}
			
		if(col_Num==-1)
            return "";
		
		ExcelWSheet=ExcelWBook.getSheetAt(index);
		Row = ExcelWSheet.getRow(rowNum-1);
        if(Row==null)
                return "";
        Cell = Row.getCell(col_Num);
        
        if(Cell==null)
            return "";        
        if(Cell.getCellType()==Cell.CELL_TYPE_STRING)
            return Cell.getStringCellValue();
        
        
        else if(Cell.getCellType()==Cell.CELL_TYPE_NUMERIC || Cell.getCellType()==Cell.CELL_TYPE_FORMULA ){
            
        	BigDecimal scaledDecimal = new BigDecimal(Cell.toString()).setScale(0, RoundingMode.HALF_EVEN);
        	String cellText = String.valueOf(scaledDecimal);
        	
            	if (HSSFDateUtil.isCellDateFormatted(Cell)) {
                    double d = Cell.getNumericCellValue();

                    Calendar cal =Calendar.getInstance();
                    cal.setTime(HSSFDateUtil.getJavaDate(d));
                    cellText =(String.valueOf(cal.get(Calendar.YEAR))).substring(2);
                    cellText = cal.get(Calendar.DAY_OF_MONTH) + "/" +cal.get(Calendar.MONTH)+1 + "/" +cellText;
             
                    System.out.println(cellText);
            	}         
	            return cellText;
	    }else if(Cell.getCellType()==Cell.CELL_TYPE_BLANK)
	        return "";		
		else 
	        return String.valueOf(Cell.getBooleanCellValue());        
       
	}
	catch(Exception e){
		e.printStackTrace();
        return "row "+rowNum+" or column "+colName +" does not exist in xls";
	}
}

}