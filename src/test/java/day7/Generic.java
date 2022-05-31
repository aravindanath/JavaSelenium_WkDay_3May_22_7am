package day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Generic {


    public static String getValue(String key){

        String path = System.getProperty("user.dir")+ File.separator+"testdata"+File.separator+"config.properties";
        String x = null;
        try {
            BufferedReader fis = new BufferedReader(new FileReader(path));
            Properties prop = new Properties();
            prop.load(fis);
            x  =  prop.getProperty(key);
        }catch (Exception e){
            e.printStackTrace();
        }
        return x;

    }



}
