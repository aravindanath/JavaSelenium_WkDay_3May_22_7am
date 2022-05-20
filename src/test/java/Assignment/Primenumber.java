package Assignment;

public class Primenumber {
    public static void main(String[] args) {
        int n=10;
        if (n==0||n==1){
            System.out.println("not a prime number");
        }
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println("Not a prime number");
            }
            else{
                System.out.println("Prime number");
            }
        }
    }
}


