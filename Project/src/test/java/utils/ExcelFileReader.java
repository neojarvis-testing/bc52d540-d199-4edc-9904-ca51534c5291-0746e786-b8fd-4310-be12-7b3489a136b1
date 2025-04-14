package utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReader {

    /**
     * @Created by Mohit
     * @Description Reads data from an Excel file based on the provided path, sheet
     *              name, row index, and cell index.
     * 
     * @param path  The path to the Excel file.
     * @param sheet The name of the sheet in the Excel file.
     * @param row   The row index (starting from 0) in the sheet.
     * @param cell  The cell index (starting from 0) in the row.
     * @return The data retrieved from the specified cell as a string, or null if an
     *         exception occurs.
     */
    public static String readExcelData(String path, String sheet, int row, int cell) {
        try {
            FileInputStream file = new FileInputStream(path);
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            return workbook.getSheet(sheet).getRow(row).getCell(cell).toString();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
