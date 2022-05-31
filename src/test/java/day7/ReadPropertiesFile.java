package day7;

import java.io.*;
import java.util.Properties;


public class ReadPropertiesFile {

    public static void main(String[] args)  {

       String x =  Generic.getValue("url");
       System.out.println(x);

//
//        String path = System.getProperty("user.dir")+ File.separator+"testdata"+File.separator+"config.properties";
//
//        try {
//            BufferedReader fis = new BufferedReader(new FileReader(path));
//            Properties prop = new Properties();
//            prop.load(fis);
//           String x =  prop.getProperty("browser");
//           System.out.println(x);
//
//
//
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }



    }
}
