package CollectionPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapPrac {
    public static void main(String[] args) {
        Map<Integer, String> mp=new HashMap<>();
        mp.put(1,"Nikhil");
        mp.put(2,"Adarsh");
        mp.put(3,"Vinay");
        mp.put(4,"Arpit");

        for(Integer key: mp.keySet()){
            System.out.println(key+" ______ "+mp.get(key));
        }
    }
}
