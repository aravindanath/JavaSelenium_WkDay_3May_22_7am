package day7;

public class ExceptionHandling_Part3 {

    public static void main(String[] args) {

        System.out.println("Hello world starting.....");

        try {
            int i = 10;
            int x = 0;
            int div = i / x;
            System.out.println("Division of two numbers: " + div);
        }catch (NullPointerException e){
            e.printStackTrace();
        }finally {
            System.out.println("Finlally block..");
        }

        System.out.println("Hello world Ending.....");

    }
}
