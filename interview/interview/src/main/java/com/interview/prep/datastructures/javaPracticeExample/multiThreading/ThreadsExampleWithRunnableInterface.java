package main.java.com.practice.javaPracticeExample.multiThreading;
/**
    2)Runnable interface.
      steps
      -Create a thread class implementing Runnable interface
      -Override run() method
      -Create object of the class
      -Invoke start() method using the object.

     public class Mythread implements Runnable {
              public void run() { sout("hello from runnable interface")}
             }
              public static void main(String[] args) {
              Thread t = new Thread(new Mythread());
              t.start();
            }
* */


public class ThreadsExampleWithRunnableInterface {
    public static void main(String[] args) {

        //job
        System.out.println("==application started ========");
        MyTaskRunnableInterface task = new MyTaskRunnableInterface();
        Thread thread = new Thread(task);
        thread.start();
        new Thread(new YourTask()).start();
        //job2
        for(int doc=1;doc<=10;doc++) {
            System.out.println( "printing documents from main class " + doc+ " printer 1");
        }
        //job 3
        System.out.println("==application finished=========");


    }

}
