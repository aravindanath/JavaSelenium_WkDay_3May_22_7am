package day8;

import java.util.ArrayList;
import java.util.List;

public class List_3 {

    public static void main(String[] args) {

        ArrayList<Object> names = new ArrayList<>();
        names.add(34.33);
        names.add("raj");
        names.add(2435);
        names.add("Arvind");
        names.add(0,"udai");


        for(int i=0; i<names.size();i++){
            System.out.println(names.get(i));
        }

    }
}
