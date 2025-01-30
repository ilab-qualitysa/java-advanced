package Chapter10;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteToExcel {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Tumelo Maphalla\\Downloads\\Courses slides\\Java Advanced\\Excel jars\\writeExcel.xlsx";
        try {
            OutputStream fileOutput = new FileOutputStream(filePath);
            //Create workbook
            XSSFWorkbook workbook = new XSSFWorkbook();
            //create a spreadsheet
            XSSFSheet spreadSheet = workbook.createSheet("Cities");
            spreadSheet.setDefaultColumnWidth(15);
            // Create header row
            XSSFRow header = spreadSheet.createRow(0);
            header.createCell(0).setCellValue("City Name");
            header.createCell(1).setCellValue("Population");
            //row1
            XSSFRow row1 = spreadSheet.createRow(1);
            row1.createCell(0).setCellValue("Pretoria");
            row1.createCell(1).setCellValue(500000);
            //row2
            XSSFRow row2 = spreadSheet.createRow(2);
            row2.createCell(0).setCellValue("Centurion");
            row2.createCell(1).setCellValue(160000);
            //row3
            XSSFRow row3 = spreadSheet.createRow(3);
            row3.createCell(0).setCellValue("Midrand");
            row3.createCell(1).setCellValue(4500000);

            //now write to workbook
            workbook.write(fileOutput);
            fileOutput.close();
            workbook.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
