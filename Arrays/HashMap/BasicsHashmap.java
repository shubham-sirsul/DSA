
import java.util.*;

public class BasicsHashmap {
    public static void main(String[] args) {
        Map<String,Integer> hm = new HashMap<>();
        // adding entry to hashmap
        hm.put("Akash",21);
        hm.put("raj",18);
        hm.put("rajhav",25);
        hm.put("rakesh",20);
        

        // // .get(key) give value nof given key 
        // System.out.println(hm.get("raj"));
        // System.out.println(hm.get("se")); // --> null

        // updating values in map
        // lets update akash age  21 to 28
        hm.put("Akash",28);
        System.out.println(hm.get("Akash"));


        // remove any pair in key and return its value & return null if key not exists
        System.out.println(hm.remove("rakesh")); 


        // cheaking if key exista in map 
        System.out.println(hm.containsKey("rakesh")); //false 
        System.out.println(hm.containsKey("Akas     h")); // ture 

        // add entry if key not exista in map 
       // if(!hm.containsKey("yash")) hm.put("yash",34);  // normally
        hm.putIfAbsent("yash",34);


        // getting all key in HASHMAP
        System.out.println(hm.keySet()); // retrun set of all key in map


        // getting all vslues 
        System.out.println(hm.values());

        // getting all data or entries in hashmap 
        System.out.println(hm.entrySet());


        // traversing on hashmap
        for(var e : hm.entrySet()){
            System.out.println("age of "+e.getKey()+" is "+e.getValue());
        }



    }
}