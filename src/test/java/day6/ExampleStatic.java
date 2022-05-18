package day6;

public class ExampleStatic {

    String city = "Bangalore";


    public static void main(String[] args) {
        staticMethod();
        ExampleStatic ec = new ExampleStatic();
        System.out.println("City "+ ec.city);
    }


    public void nonStaticMethod(){
        System.out.println("Non static method");
        System.out.println("City "+ city);
    }


    public static void staticMethod(){
        System.out.println(" static method");
        ExampleStatic ec = new ExampleStatic();
        System.out.println("City "+ ec.city);
    }
}
