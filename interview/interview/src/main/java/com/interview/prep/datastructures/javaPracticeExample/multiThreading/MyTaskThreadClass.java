package main.java.com.practice.javaPracticeExample.multiThreading;


import java.util.HashMap;

public class MyTaskThreadClass extends Thread{
    @Override
   public void run() {
        HashMap<String,Integer> map = new HashMap();
        for (int doc=1;doc<=10;doc++) {
            System.out.println("printing documents from myTask " + doc +" printer 2");
        }
    }
}
