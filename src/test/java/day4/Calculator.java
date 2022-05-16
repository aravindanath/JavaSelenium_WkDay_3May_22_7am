package day4;

public class Calculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();// Class Object
        calculator.addNumber(10,20);
        calculator.addNumber(345,345);
       calculator.addNumber(12,21,23);
        int x =   calculator.multiply(33,22);
        System.out.println(x*302);


    }


    /**
     *Assignment
     *
     *  create method for +, - , / ,%,*
     */



    // parm method
   //accessModifier returnType methodname (Parameters)
    public void addNumber(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Addition "+ sum);
    }

        // method overloading
    public void addNumber(int num1, int num2, int num3){
        int sum = num1+num2+num3;
        System.out.println("Addition "+ sum);
    }

    public int multiply(int x, int y){
        int mul = x * y;
        return mul;
    }


}
