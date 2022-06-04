package day7;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel_2 {


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

       int getRowCount = sheet.getLastRowNum();

       for( int i=0;i<getRowCount+1;i++){
           String name =    sheet.getRow(i).getCell(0).getStringCellValue();
           String city =    sheet.getRow(i).getCell(1).getStringCellValue();
           String pincode =    sheet.getRow(i).getCell(2).getStringCellValue();
           System.out.println(name +" || "+ city +" | "+ pincode);

       }





    }
}
