package main.java.com.practice.javaPracticeExample.collections;
// does not allow dublication
// data is onsorted
// does not maintain order
import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> setdemo = new HashSet<>();
        setdemo.add("Hiren");
        setdemo.add("Hiren");
        setdemo.add("Deasi");
        setdemo.add("dipu");
        setdemo.add("parmar");
        System.out.println(setdemo);
        Iterator<String> data = setdemo.iterator();
        while (data.hasNext()) {
            String str = data.next();
            System.out.println(str);
        }
    }
}