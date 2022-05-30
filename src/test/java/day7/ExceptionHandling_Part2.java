package day7;

public class ExceptionHandling_Part2 {

    public static void main(String[] args) {

        System.out.println("Hello world starting.....");

        try {
            int i = 10;
            int x = 0;
            int div = i / x;
            System.out.println("Division of two numbers: " + div);
        }catch (NullPointerException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();

       }catch (Exception e){
        e.printStackTrace();
      }

        System.out.println("Hello world Ending.....");

    }
}
