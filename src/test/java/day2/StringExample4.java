package day2;

public class StringExample4 {

    public static void main(String[] args) {

//                     0123456
        String name = "Arvind#34345634!sfgdfa";

        System.out.println(name.split("#")[0]);
        System.out.println(name.split("#")[1]);
        System.out.println(name.split("!")[1]);

        System.out.println(name.isEmpty());
        System.out.println(name.substring(3));
        System.out.println(name.substring(3,10));





    }
}
