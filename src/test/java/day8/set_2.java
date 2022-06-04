package day8;

import java.util.HashSet;
import java.util.Set;

public class set_2 {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Arvind");
        names.add("raj");
        names.add("Kumar");
        names.add("Arvind");


      for(String str : names){
          System.out.println(str);
      }








    }
}
