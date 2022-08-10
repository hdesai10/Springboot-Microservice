package main.java.com.practice.javaPracticeExample.multiThreading;

class RunnableInterface {

}

public class MyTaskRunnableInterface extends RunnableInterface implements Runnable{
    @Override
   public void run() {
        for (int doc=1;doc<=10;doc++) {
            System.out.println("printing documents from runnable " + doc +" printer 2");
        }
    }
}

class YourTask implements Runnable {
    @Override
    public void run() {
        for (int doc=1;doc<=10;doc++) {
            System.out.println("printing documents from runnable " + doc +" printer 3");
        }
    }
}