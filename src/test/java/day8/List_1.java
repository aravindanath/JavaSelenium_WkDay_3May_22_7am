package day8;

import java.util.ArrayList;
import java.util.List;

public class List_1 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Arvind");
        names.add("raj");
        names.add("Kumar");
        names.add("Arvind");


        System.out.println(names.size());
        System.out.println(names.get(3));
    }
}
