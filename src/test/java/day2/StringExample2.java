package day2;

public class StringExample2 {

    public static void main(String[] args) {

//                     0123456
        String name = "Arvind";

        System.out.println(name.endsWith("ind"));
        System.out.println(name.contains("vin"));
    /*
     == --> is a operator can used with string,int,long
     .equals --> String class
     */
        System.out.println(name.equals(2345));
        System.out.println(name.equalsIgnoreCase("arvind"));

        System.out.println("arvind"=="Arvind");
        System.out.println(1234==12345);



    }
}
