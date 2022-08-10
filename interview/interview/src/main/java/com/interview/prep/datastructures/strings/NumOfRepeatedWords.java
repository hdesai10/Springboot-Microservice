package main.java.com.practice.strings;

import java.util.HashMap;
import java.util.Locale;

public class NumOfRepeatedWords {
    public static void main(String[] args) {
        String str = "hiren hiren hiren is best and hiren is smarter day by day";
        HashMap<String, Integer> wordstore = countWords(str);
        System.out.println(wordstore);
    }

    /**
     * take string and count repeated words
     *
     * @param str1 string message
     * @return word and number of time it repeats
     */
    private static HashMap<String, Integer> countWords(String str1) {
        String str = str1.toLowerCase();
        String[] split = str.split(" ");
        HashMap<String, Integer> wordstore = new HashMap<>();
        for (String s : split) {
            if (wordstore.containsKey(s)) {
                int count = wordstore.get(s);
                wordstore.put(s, count + 1);
            } else {
                wordstore.put(s, 1);
            }
        }
        return wordstore;
    }
}
