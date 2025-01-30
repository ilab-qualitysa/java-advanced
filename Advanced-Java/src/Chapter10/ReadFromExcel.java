package Chapter10;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Tumelo Maphalla\\Downloads\\Courses slides\\Java Advanced\\Excel jars\\writeExcel.xlsx";
        File myFile = null;

        try {
            FileInputStream fileInput = new FileInputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
            XSSFSheet sheet = workbook.getSheetAt(0);
            for(Row myRow : sheet) {
                for(Cell myCell : myRow) {
                    if(myCell.getCellTypeEnum() == CellType.STRING){
                        System.out.print(myCell.getStringCellValue() + "\t\t");
                    } else if(myCell.getCellTypeEnum() == CellType.NUMERIC) {
                        System.out.print(myCell.getNumericCellValue() + "\t\t");
                    } else if(myCell.getCellTypeEnum() == CellType.FORMULA) {
                        System.out.print(myCell.getCellFormula() + "\t\t");
                    }
                }
                System.out.println();
            }
            fileInput.close();
            workbook.close();
            //Desktop.getDesktop().open(myFile);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");;
        } catch (IOException e) {
            System.err.println("Cannot raed from file");;
        }
    }
}
