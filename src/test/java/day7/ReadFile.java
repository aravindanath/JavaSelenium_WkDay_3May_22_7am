package day7;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        //"/Users/aravindanathdm/Documents/JavaSelenium_WkDay_3May_22";
        String path = System.getProperty("user.dir")+File.separator+"testdata"+File.separator+"demo.txt";

        System.out.println(path);

        File file = new File(path);
        file.createNewFile();

        /**
         *   FileInputStream  "Sanjeev" --> 0101001 ---> "Sanjeev"
         *   FileOutputStream "Sanjeev" <--- 0101001 <--- "Sanjeev"
         *
         *   BufferedReader "Sanjeev" -->  "Sanjeev"
         *   BufferedWriter "Sanjeev" <---- "Sanjeev"
         */

//        FileReader fr = new FileReader(file);
        BufferedReader read = new BufferedReader(new FileReader(file));

//         String val =  read.readLine();
//         System.out.println(val);

//         for(int i=1; i<=6 ;i++){
//             System.out.println(read.readLine());
//         }

        String x = "";
        while ((x=read.readLine())!=null){
            System.out.println(x);
        }

    }
}
