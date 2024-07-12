package CollectionFrameworks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetPractice {
    public static void main(String[] arg) {
//        Set<Integer> set = new TreeSet<>();
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        System.out.println("Set size : " + set.size());
        set.remove(2);

        Iterator it = set.iterator();

        while(it.hasNext())
            System.out.println(it.next());

    }
}
