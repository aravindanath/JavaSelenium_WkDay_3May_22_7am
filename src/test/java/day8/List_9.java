package day8;

import java.util.ArrayList;
import java.util.List;

public class List_9 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Arvind");
        names.add("raj");
        names.add("Kumar");
        names.add("Arvind");
        names.add(0,"udai");


        List<String> course = new ArrayList<>();
        course.add("Java");
        course.add("pyhton");
        course.addAll(names);

        System.out.println(course);



    }
}
