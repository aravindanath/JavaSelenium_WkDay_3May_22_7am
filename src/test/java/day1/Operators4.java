package day1;

public class Operators4 {

    public static void main(String[] args) {
        /**
         *  && || !
         *  < >
         *  <= >=
         *  !=
         *  ==
         */

      int i = 10;
      int y = 20;

      System.out.println(i<y && i>y);
        /**
         * true & true = true
         * true & false = false
         * false & false = false
         * false & true = false
         */

        System.out.println(i<y || i>y);
        /**
         * true & true = true
         * true & false = true
         * false & false = false
         * false & true = true
         */


        System.out.println(i!=y);

        String fn = "Virat";
        String ln = "Koili";

        System.out.println(fn+ln);

    }
}
