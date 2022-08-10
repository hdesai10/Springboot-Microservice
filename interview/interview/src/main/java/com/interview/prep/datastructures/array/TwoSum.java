package main.java.com.practice.array;

/*
PROBLEM:
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
/*
  SOLUTION 1:
   Array = [3,5,-4,8,11,1,-1,6]. Target = 10;
   We can solve this problem by using two for loop for all possible pair of sum to 10.
   since we are going to use two for loops, we are going to have o(N)^2 time complexity


 */
/*
 SOLUTION 2: BEST
  we can use HashTable to store every number we see in Hashtable and which is going to let us access this number in constant time.
  lets say we have HashTable. {     }
  what we know from problem is we have target = 10, and currentNum=x; so we going to need to find the y.
  formula is going to be target = x+y. we can also write as. y=target-x
  if y is in HashTable then we are going to return x and y otherwise we are going to add x in the hashTable.


 */

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,9,4,3};
        int result[]=twoSum(num,7);
//        for (int i : result) {
//            System.out.println(i);
//        }
        int byForloop[] = twoSumWithLoop(num,11);
        System.out.println(" by loop  " + byForloop[0] +" " +byForloop[1]);
    }

    public static int[] twoSum(int[] nums,int target) {

        HashMap<Integer,Integer> maps = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            int y = target - nums[i];
            if(maps.containsKey(y)) {
                return new int[] {y,nums[i]};
            }
            else {
                maps.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("no match");
    }

    public static int[] twoSumWithLoop(int[] nums, int target) {
        for (int i=0;i<nums.length; i++) {
            int firstNum=nums[i];
            for (int j=i+1;j<nums.length; j++) {
                int secondNum = nums[j];
                if (firstNum + secondNum == target) {
                    System.out.println(firstNum +" "+ secondNum);
                    return new int[]{firstNum, secondNum};
                }
            }
        }
        return new int[0];
    }
}
