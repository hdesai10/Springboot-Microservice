package main.java.com.practice.javaPracticeExample.lamda.streams;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntStream {
    public static void main(String[] args) throws IOException {

        //1.Interger Stream
        System.out.println("===========sum with Lamda=============");
        System.out.println(
        java.util.stream.IntStream.range(1,4)
                .sum());

        System.out.println("============print number in for each===========");
        // 2. print number in for each
        java.util.stream.IntStream.range(20,25)
                .forEach(System.out::print);
        System.out.println();

        System.out.println("============Stream .of sorted and findFirst. With Arrays===========");
        // 3. stream of softed and findfirst
        String[] names =  {"Hiren", "Dipu" , "Kevin","Desai"};
        Arrays.stream(names)
                .sorted()
                .filter(x -> x.startsWith("D"))
                .forEach(System.out::println);

        System.out.println("============average square of integer using map===========");

        int[] number = {2,3,4};
        Arrays.stream(number)
                .map(x -> x*x)
                .average()
                .ifPresent(System.out::println);


        System.out.println("============Stream for List , filter and print===========");
        List<String> people = Arrays.asList("AI","Hiren","Desai","Dipu","kevin");
        people.stream()
                .map(String::toLowerCase)
                .filter(x -> x.length() >2)
                .forEach(System.out::println);
    }
}
