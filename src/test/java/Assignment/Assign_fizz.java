package Assignment;

public class Assign_fizz {
    public static void main (String[] args)
    {
        // int i=100;
        //int n=11;
        //System.out.println (i/3);
        //System.out.println (i%3);
        for(int n=1;n<=100; n++)
        {
            if (n%3==0){
                System.out.println(n+ "Fizz");
            }
            else if (n%5==0){
                System.out.println(n+ "Buzz");
            }
            else if (n%3==0 && n%5==0){
                System.out.println(n+ "Fizz Buzz");
            }
            else{
                System.out.println("Not divisible by 3 or 5");
            }
        }
    }
}