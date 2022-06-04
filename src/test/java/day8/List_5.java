package day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_5 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Arvind");
        names.add("raj");
        names.add("Kumar");
        names.add("Arvind");
        names.add(0,"udai");

       Iterator it =  names.iterator();

       while (it.hasNext()){
           System.out.println(it.next());
       }


    }
}
