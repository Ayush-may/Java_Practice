package CollectionFrameworks;

import java.util.*;

public class ListPractice {

    public static void main(String[] arg) {

//      Creation of list interface obj
//        List<Integer> list = new LinkedList<>();
        List<Integer> list = new Vector<>();

//        add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//        remove
        list.remove(1);
        list.remove(2);

//        update
        list.set(0, 10);
        list.set(1, 20);

//        get
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.print(list);

//        for(Integer x : list){
//            System.out.println(x);
//        }
    }
}
