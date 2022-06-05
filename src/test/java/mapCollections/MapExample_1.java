package mapCollections;

import java.util.HashMap;
import java.util.Map;

public class MapExample_1 {


    public static void main(String[] args) {


        Map<String,String> str = new HashMap<>();
        str.put("Name","Arvind");
        str.put("City","Bangalore");
        str.put("Pincode","560066");
        str.put("Fullname","Arvind");

//        System.out.println(str.get("Name"));

        for(Map.Entry<String,String> ref :  str.entrySet() ){
            System.out.println(ref);
        }

    }
}
