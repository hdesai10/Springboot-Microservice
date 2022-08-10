package main.java.com.practice.javaPracticeExample.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList();
        ArrayList list2 = new ArrayList();

        list1.add("Hiren");
        list1.add("Desai");
        list1.add("Dipu");
        list1.add("parmr");
        list1.add("Hiren");
        System.out.println(list1);

        list2.add("Dipu");
        list2.add(2);
        list2.add(2.2);
        System.out.println(list2);

         // get elements value from list
         String name = list1.get(2);
        System.out.println(name + "getting ");

        Object o = list2.get(2);
        System.out.println(o + "  when we dont know data types");

        // update list
        list1.set(0,"replaced hiren in list");
        System.out.println(list1);

        // remove elemetns
        list1.remove(0);
        System.out.println(list1);

        // remove all by list1.clear()
        if (list1.contains("Dipu")) {
            System.out.println("yes we found dipu in list");
        }

        // Iterate in List with enhance for loop
        System.out.println("enhance for loop ==========");
        for (String str : list1) {
            System.out.println( str + "from enhance loop");
        }
        System.out.println("simple for loop ==========");
        // for loop
        for (int i =0;i<list1.size();i++) {
            System.out.println(list1.get(i));
        }

        System.out.println("Iteraring with iterator");
        Iterator<String> str  = list1.iterator();
//        System.out.println(str.hasNext());
        while (str.hasNext())
        {
            String hasnext = str.next();
            System.out.println(hasnext);
        }
    }
}
