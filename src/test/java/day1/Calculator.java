package day1;

public class Calculator {


    public static void main(String[] args) {


// classname  refvar  = new className()
    Calculator abc = new Calculator();  // class object
        abc.addNumber(20,30);
    }

    // method
    // access modifiers  return type method name (param)

    public void addNumber(int x, int y){
        int sum = x +y;
        System.out.println("Addition of two numbers: "+ sum);
    }


}
