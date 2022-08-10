package main.java.com.practice.reverseSring;

import java.util.LinkedList;

// there are multiple options  we can reverse string with. here we going to reverse string with stringBuilder and useing for loop.
public class ReverseString {
    public static void main(String[] args){
        String str="Hiren Desai";
        ReverseStringWithBuilder(str);
        System.out.println(ReverseStringWithForloop(str));
        SeperateByWord();

        LinkedList<String> str1 = new LinkedList<>();
    }
    private static void SeperateByWord() {
        System.out.println("=========================");
        String message="welcome to the code practice";
        String[] arr=message.split(" ");
        for (String str1:arr){
            System.out.println(str1);
        }
    }
    private static void ReverseStringWithBuilder(String str) {
        System.out.println("===========from builder==============");
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());
    }
    private static String  ReverseStringWithForloop(String str) {
        System.out.println("===========from loop==============");
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        return reverse;
    }

}
