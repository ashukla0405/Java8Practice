package collection.example;

import java.util.HashMap;
import java.util.Map;
//import java.util.Map;

public class HashMapSample {

    public static void main(String[] args) {

        HashMap<String,Integer> map=new HashMap<>();
        map.put("Anurag",10);
        map.put("Anurag1",20);

        System.out.println("Size of Map is - "+ map.size());
        System.out.println("map - " +map);

        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println("Key is- " + e.getKey() +"Value is- " + e.getValue());
        }


    }




}
