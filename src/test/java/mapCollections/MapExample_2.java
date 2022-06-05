package mapCollections;

import java.util.HashMap;
import java.util.Map;

public class MapExample_2 {


    public static void main(String[] args) {


        Map<Integer,String> str = new HashMap<>();
        str.put(101,"Arvind");
        str.put(102,"Bangalore");
        str.put(103,"560066");
        str.put(104,"Arvind");

//        System.out.println(str.get("Name"));

        for(Map.Entry<Integer,String> ref :  str.entrySet() ){
            System.out.println(ref);
        }

    }
}
