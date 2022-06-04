package day8;

import java.util.ArrayList;
import java.util.List;

public class List_2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Arvind");
        names.add("raj");
        names.add("Kumar");
        names.add("Arvind");
        names.add(0,"udai");


        for(int i=0; i<names.size();i++){
            System.out.println(names.get(i));
        }

    }
}
