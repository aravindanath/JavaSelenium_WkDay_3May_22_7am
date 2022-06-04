package day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_6 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Arvind");
        names.add("raj");
        names.add("Kumar");
        names.add("Arvind");
        names.add(0,"udai");

       ListIterator it =  names.listIterator();

       while (it.hasNext()){
           System.out.println(it.next());
       }


       System.out.println("**********");

       while (it.hasPrevious()){
           System.out.println(it.previous());
       }
    }
}
