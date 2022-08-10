package main.java.com.practice.javaPracticeExample.multiThreading;

/*
 ?) what is Java Thread ?
    - Thread is a light weight sub process. e
    - It is the smallest independent unit of program.
    - contain a separate path of execution.
    - Every java program contains at least one thread - main
    - A thread is created and controlled by the java.lang.Thread class. don't need to import

 ?) Thread LifeCycle
    -New: A new thread begins its life cycle in  this state and remains here until the program starts the thread. It is also know as thread is born.
    -Runnable: Once new Thread starts. The thread comes under runnable stage. A thread stays in this state until it executing its task.
        -waiting: A thread enters this state when it is temporarily in an inactive state. i.e it is still alive but is not in eligible to run. It is can be in waiting, sleeping or blocked state.
    -Running: In this state a thread starts executing by entering run() method and the yield() method can send them to go back to the runnable state.
    -Terminated: A runnable thread enters the terminated state when it completes its task or otherwise terminates.

  ?) why do we need a thread.
     when we have long running operation that time we need a thread.

  ?) How to create thread?
    There are two ways to create thread in java.
    1) Thread class
       steps
        -Create a thread class
        -override run() method
        -create object of the class
        -Invoke start method to execute the custom threads run()

            public class Mythread extends Thread {
              public void run() { sout("hello")}
             }
              public static void main(String[] args) {
              MyThread thread = new MyThread();
              thread.start();
            }


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


  ?) what is the differance between Thread class and Runnable Interface.
    -Each thread create new object for both Thread class and Runnable interface.
    -Both have memory consumption
    -using thread class. A class extending thread cannot extend any other class since multiple inheritance is not supported.
    -using runnable interface, Along with runnable interface we can extend any other class.
    -Thread is tight coupling where runnable is loose coupling.

   ?) What is daemon thread?
     demon thread is the one that is execute by JVM with main class starts.
     example: Thread task = new Thread(threadClass);
     task.setDaemon(true)

   ?)What is Multi Threading ?
    -Multi threading is ability of program to run two or more threads concurrently(parallel) where is thread can handle a different task at the same time making optimal use of available resources.


* */


public class ThreadsExampleWithClass {
    public static void main(String[] args) {
        // example with Thread class
        // whatever we write to main class will be executed by main thread.
        // threads always execute the jobs in a sequence
        // Lets we have first job that take 5 mins to run and job 2 takes 60 mins to run.Now job 3 has to wait for job to finish in order to executes its task.
           // so to solve long running task we can use threads to execute parallel
        //job
        System.out.println("==application started ========");
        MyTaskThreadClass task = new MyTaskThreadClass();
        task.start();
        //job2
        for(int doc=1;doc<=10;doc++) {
            System.out.println( "printing documents from main class " + doc+ " printer 1");
        }
        //job 3
        System.out.println("==application finished=========");


    }

}
