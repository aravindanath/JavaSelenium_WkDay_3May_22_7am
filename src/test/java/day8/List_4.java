package day8;

import java.util.ArrayList;

public class List_4 {

    public static void main(String[] args) {

        ArrayList<Object> names = new ArrayList<>();
        names.add(34.33);
        names.add("raj");
        names.add(2435);
        names.add("Arvind");
        names.add(0,"udai");

        for(Object obj : names){
            System.out.println(obj);
        }

    }
}
