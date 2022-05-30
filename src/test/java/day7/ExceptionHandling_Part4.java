package day7;

public class ExceptionHandling_Part4 {

    public static void main(String[] args) throws Exception {

        System.out.println("Hello world starting.....");


        int amt = 10;

        if(amt>=100){
            System.out.println("Collect cash");
        }else{
            throw new Exception("Enter 100 multiples");
        }

    }
}
