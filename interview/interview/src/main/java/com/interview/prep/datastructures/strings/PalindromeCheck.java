package main.java.com.practice.strings;

/**
 * Write a function that takes in a non-empty string and that returns a boolean representing whether the string is a palindrome.
 * A palindrome is defined as a string that's written same forward and backward. Note that single character are palindromes.
 */
public class PalindromeCheck {
    public static void main(String[] args) {

//        System.out.println(palindromeWithLoop("abac"));
        System.out.println(isPalindromeWithStringBuilder("aba"));

    }

    /**
     * Take string and return true is string same when reversed
     * @param str for passing String input
     * @return return true or false
     */
    public static boolean isPalindromeWithStringBuilder(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length()-1; i>=0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString().equals(str);
    }
    public static boolean palindromeWithLoop(String str) {
        /* O(n^2) time | O(n) space */
        String reversedString = "";
        for (int i=str.length()-1; i>=0; i--) {
            reversedString = reversedString + str.charAt(i);
        }
        return reversedString.equals(str);
    }
}
