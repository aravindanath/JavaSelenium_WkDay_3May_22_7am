package day7;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {


    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir")+ File.separator+"testdata"+File.separator+"data.xlsx";
        System.out.println(path);
        /**
         * HSSF: Horible spreadsheet format .xls
         * XSSF: xml spreadsheet format  .xlsx
         */
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fis);

       Sheet sheet =  wb.getSheetAt(1);

      String value =    sheet.getRow(1).getCell(0).getStringCellValue();

       System.out.println(value);



    }
}
