package main.java.com.practice.javaPracticeExample.abstrac;

public class AbstactExample {
    public static void main(String[] args) {
        Shape rectangle = new Rectengle(20,30,"rectangle");
        Shape circle = new Circle(30,"circle");

        System.out.println("Rectenagle :" + rectangle.area());
        System.out.println("Cicle: " +circle.area());
    }
}
