package utils;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	XSSFWorkbook workbook;
	XSSFSheet sheet;

	public XSSFWorkbook InitFile(String fileName) throws Exception {

		FileInputStream fis = new FileInputStream(fileName);
		workbook = new XSSFWorkbook(fis);
		return workbook;
	}

	public String GetCellData(String sheetName, int rowNum, int colNum) {
		sheet = workbook.getSheet(sheetName);
		return sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	}

}
