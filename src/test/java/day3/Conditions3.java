package day3;

public class Conditions3 {

    public static void main(String[] args) {

        int marks = 800;

        if(marks<35){
            System.out.println("FAIL");
        }else if(marks>=35 && marks<50){
            System.out.println("PASS Class");
        }else if(marks>=50 && marks<65){
            System.out.println("Second Class");
        }else if(marks>=65 && marks<85){
            System.out.println("First Class");
        }else if(marks>=85 && marks<=100){
            System.out.println("Top Class");
        }else {
            System.out.println("Contact admin");
        }


    }
}
