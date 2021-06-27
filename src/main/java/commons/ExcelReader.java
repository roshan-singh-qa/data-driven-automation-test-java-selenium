package commons;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelReader {

    public static String[][] getExcelData(String fileName, String sheetName) {
        String[][] arrayExcelData = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            XSSFRow row = sheet.getRow(0);

            int numberOfRows = sheet.getPhysicalNumberOfRows();
            int numberOfColumns = row.getLastCellNum();

            Cell cell;
            arrayExcelData = new String[numberOfRows - 1][numberOfColumns];
            for (int i = 1; i < numberOfRows; i++) {
                for (int j = 0; j < numberOfColumns; j++) {
                    row = sheet.getRow(i);
                    cell = row.getCell(j);
                    arrayExcelData[i - 1][j] = cell.getStringCellValue();
                }
            }
        } catch (Exception e) {
            System.out.println("The exception is: " + e.getMessage());
        }

        return arrayExcelData;
    }
}
