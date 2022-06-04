package day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_8 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Arvind");
        names.add("raj");
        names.add("Kumar");
        names.add("Arvind");
        names.add(0,"udai");

        names.remove(3);
        System.out.println(names);
    }
}
