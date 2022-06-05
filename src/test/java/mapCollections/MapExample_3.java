package mapCollections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExample_3 {


    public static void main(String[] args) {


        HashMap<Integer,String> str = new HashMap<>();
        str.put(101,"Arvind");
        str.put(102,"Bangalore");
        str.put(103,"560066");
        str.put(104,"Arvind");
        str.put(null,null);


        for(Map.Entry<Integer,String> ref :  str.entrySet() ){
            System.out.println(ref);
        }


//
        Hashtable<Integer,String> map2 = new Hashtable<>();
        map2.put(101,"Arvind");
        map2.put(102,"Bangalore");
        map2.put(103,"560066");
        map2.put(104,"Arvind");
        map2.put(null,null);

        for(Map.Entry<Integer,String> ref :  map2.entrySet() ){
            System.out.println(ref);
        }

    }
}
