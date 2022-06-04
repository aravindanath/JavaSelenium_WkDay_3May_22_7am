package day7;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TypeCase {


    public static void main(String[] args) throws IOException {


        String six = "6";
        Integer y = Integer.parseInt(six);
        Float f = Float.parseFloat(six);
        int x = 10;
        System.out.println(f);
        String z = String.valueOf(x);
        System.out.println(y+x);
        System.out.println(six+x);






    }
}
