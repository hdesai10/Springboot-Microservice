/*

 */

package main.java.com.practice.array;
import java.util.*;
import java.util.stream.Collectors;

public class SubSequence {
    public static void main(String[] args) {
        int[] array = {1,4,6,7,9,10};
        int subSequence[] = {1,7,9};
        List<Integer> array1 = Arrays.stream(array).boxed().collect(Collectors.toList());
        List<Integer> subSequence1 = Arrays.stream(subSequence).boxed().collect(Collectors.toList());

        isValidSubSequenvce(array1,subSequence1);
    }
    public static boolean isValidSubSequenvce(List<Integer> array,List<Integer> subSequence) {
        int subInx = 0;
        for (int i=0; i<array.size(); i++) {
            if (subInx == subSequence.size()) {
                break;
            }
            if (subSequence.get(subInx).equals(array.get(i))) {
                System.out.print(array.get(i) + "       ");
                System.out.println(subSequence.get(subInx));
                subInx++;
            }
        }

        return subInx == subSequence.size();
    }
}
