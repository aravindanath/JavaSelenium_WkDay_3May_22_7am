package day7;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class WriteToExcel {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir")+ File.separator+"testdata"+File.separator+"data.xlsx";
        System.out.println(path);
        /**
         * HSSF: Horible spreadsheet format .xls
         * XSSF: xml spreadsheet format  .xlsx
         */
        FileOutputStream fis = new FileOutputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook();

        Sheet sheet =  wb.createSheet("sheet3");


        Row row = sheet.createRow(0);

        Cell cell = row.createCell(0);

        cell.setCellValue("Madurya");

        wb.write(fis);

        fis.flush();
        fis.close();












    }
}
