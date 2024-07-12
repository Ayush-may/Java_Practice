package CollectionFrameworks;

import java.util.*;

public class MapPractice {

    public static void main(String[] arg) {
        Map<String, Integer> map = new HashMap<>();
//        SortedMap<String, Integer> map = new TreeMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(" get method :" + map.get("two"));
        System.out.println("contain key 1 :" + map.containsValue(4));
        System.out.println("size method :" + map.size());
        System.out.println("isEmpty method :" + map.isEmpty());
        System.out.println("keySet method :" + map.keySet());
        Collection<Integer> list = map.values();
        System.out.println("values method :" + list);


        System.out.println(map);
    }

}
