package EncounterBuilder;

//IMPORTS
import java.util.ArrayList;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;


/**
 * This is the basic Excel Reader.
 * Its job is to read the sample sheet of stats and convert them to some datatype
 * 
 * @author joel
 * @version 0.1
 */
public class ExcelReader {
	
	//Path to Sample Sheet
	public static final String XLSX_FILEPATH = "sampleBook.xlsx";
	
	//Array List to hold all sheets
	public static ArrayList<Sheet> sheetList = new ArrayList<>();
	
	/**
	 * The 'Entry Point' to reading an excel sheet.
	 * Right now it reads whatever is in the final XLSX_FILEPATH.
	 * 
	 * @throws IOException 
	 * @throws InvalidFormatException
	 */
	public static void readExcel() throws IOException, InvalidFormatException {
		
		/* TODO
		 * Right now this is pretty rudimentary. We're just reading a scripted set of data.
		 * Preset columns could work, but they aren't ideal.
		 */
		
		//Local Workbook object for the excel file.
		Workbook workbook = WorkbookFactory.create(new File(XLSX_FILEPATH));
		
		//Prints number of sheets.
		System.out.println("Sheets: " + workbook.getNumberOfSheets());
		
		//Creates a local iterator to run through the sheets in our local workbook
		Iterator<Sheet> sheetIterator = workbook.sheetIterator();
		
		//While loop to iterate through sheets
		while(sheetIterator.hasNext()) {
			//Get our next sheet.
			Sheet currentSheet = sheetIterator.next();
			
			//Add current sheet to our array list.
			sheetList.add(currentSheet);
			
			//Print the sheet name.
			System.out.println(currentSheet.getSheetName());
		}
		
		//Data Formatter for Reading Excel contents
		DataFormatter dataFormatter = new DataFormatter();
		
		Iterator<Row> rowIterator =  sheetList.get(0).rowIterator();
		while(rowIterator.hasNext()) {
			Row row = rowIterator.next();
			
			Iterator<Cell> cellIterator = row.cellIterator();
			
			String[] data = new String[5];
			int i = 0;
			
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				System.out.print(dataFormatter.formatCellValue(cell));
			}
			
			
			
			
			
		}
		
		
		
	}
}
