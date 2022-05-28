package day6;

import org.openqa.selenium.WebDriver;

public class ExampleOverriding {

    public static void main(String[] args) {

        RBI rbi; // parent Class reference
        rbi =  new AxisBank(); // child class object
        System.out.println("Axis Bank: "+rbi.getIntrestRate());

        rbi = new SBI();
        System.out.println("SBI Bank: "+rbi.getIntrestRate());
        // Overriding / polymorph
       // WebDriver driver = new ChromeDriver();
        // List<String> list = new ArrayList<String>();
        // Set<String> set = new HashSet<String>()

    }
}
