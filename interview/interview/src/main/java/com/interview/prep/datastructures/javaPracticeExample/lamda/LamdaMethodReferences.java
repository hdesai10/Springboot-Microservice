package main.java.com.practice.javaPracticeExample.lamda;

import java.sql.SQLOutput;

interface Calculator {
    void add(int number1, int number2);
}

class CalC {
    public static void addSomething(int num1, int num2) {
        System.out.println(num1+"  + "+num2 +" = "+(num1+num2));
    }

    public  void minusSomething(int num1, int num2) {
        System.out.println(num1+"  + "+num2 +" = "+(num1-num2));
    }
}




public class LamdaMethodReferences {

    public static void main(String[] args) {

        //1. referring to a static method.
        Calculator calc = CalC::addSomething; // method reference
        calc.add(11,23);

        //2. reference to non static method o instance method
        CalC calC2 = new CalC();
        Calculator cref = calC2::minusSomething;
        cref.add(25,20);


        //3. Refereance to a constructor
        Messanger message = Message::new;
      message.getMessage("message referencer to a  constructor");

    }
}

interface Messanger {
    Message getMessage(String msg);
}

class Message  {
    Message(String msg) {
        System.out.println(" message is : " + msg);
    }
}