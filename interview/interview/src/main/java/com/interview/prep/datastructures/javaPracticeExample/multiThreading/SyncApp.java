package main.java.com.practice.javaPracticeExample.multiThreading;

class Printer {
    synchronized void printDocuments(int numOfCopies, String docName) {
        for (int i=1;i<=numOfCopies;i++) {
            System.out.println(" >> printing "+ docName+ " "+ i);
        }
    }
}
class MyThread implements Runnable {
    Printer printer;

    MyThread(Printer p) {
        printer = p;
    }

    @Override
    public void run() {
        printer.printDocuments(10,"Hirens resumes");
    }
}
class YourThread implements Runnable {
    Printer printer;

    YourThread(Printer p) {
        printer = p;
    }

    @Override
    public void run() {
        printer.printDocuments(10,"Dipu's resumes");
    }
}
public class SyncApp {
    public static void main(String[] args)
    {
        //
        System.out.println("==Application is starter==");
        Printer printer = new Printer();
        Thread myThread = new Thread(new MyThread(printer));
        myThread.start();
        Thread yourThread = new Thread(new YourThread(printer));
        yourThread.start();
        System.out.println("==Application is finished==");
    }
}
