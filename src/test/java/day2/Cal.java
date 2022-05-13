package day2;

public class Cal
{

    public static void main(String[] args) {
        Cal c = new Cal();
        c.add(19,2902);
       int x =  c.mul(33,22);
       System.out.println(x/2*32+3);
    }


    public void add(int x, int y){
        int sum = x+ y;
        System.out.println("Sum: "+ sum);
    }

    public int mul(int x , int y){
        int m = x * y;
        return m;
    }
}
