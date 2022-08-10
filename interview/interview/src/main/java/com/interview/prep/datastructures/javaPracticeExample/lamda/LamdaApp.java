package main.java.com.practice.javaPracticeExample.lamda;


@FunctionalInterface  // optional we do not need to annotation.
interface Cab { // When an interface will have exactly 1 abstract mathod we can say it as a functional interface.
    void bookCab();
}

interface CabMethodWithParameter {
    void bookCabFroomTo(String from, String to);
}

// we do not this class since we are going to use lambda anonymous class implementation
/* class UberX implements Cab {
    public void bookCab() {
        System.out.println("uberX will : arriving soon");
    }
}*/
public class LamdaApp {

    public static void main(String[] args) {
        // Lambda x without any parameters.
        Cab cab = () -> {
            System.out.println("Uberx booked :: will arrive soon :)");
        };
        cab.bookCab();

        System.out.println("========================Lamda with parameter===============================");
        CabMethodWithParameter cabMethodWithParameter = (from, to) -> {
            System.out.println("your cab booked " + from + " to " + to + " arriving soon");
        };
        cabMethodWithParameter.bookCabFroomTo("chickli","navsari");

    }
}
