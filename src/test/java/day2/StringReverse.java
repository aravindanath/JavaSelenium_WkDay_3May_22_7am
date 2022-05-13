package day2;

public class StringReverse {

    public static void main(String[] args) {

        String name = "Arvind";

        System.out.println(name);

        StringBuffer sb = new StringBuffer(name);
        sb.reverse();
        System.out.println(sb);


    }
}
