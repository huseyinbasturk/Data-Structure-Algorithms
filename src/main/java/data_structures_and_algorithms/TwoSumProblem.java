package data_structures_and_algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

//    Problem: Two Sum
//
//• Given an array of integers nums and an integer target, return indices of the two
//    numbers such that they add up to target.
//            • You may assume that each input would have exactly one solution, and you
//    may not use the same element twice.
//• You can return the answer in any order.
//• No solution will return empty array.
//
//    Example:
//    Input: nums = [2, 7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    public static void main(String[] args) {
        int[] array = new int[]{2,7,9,11};
        int target = 9;
       // System.out.println(Arrays.toString(twoSumSolution(array,target)));
        System.out.println(Arrays.toString(twoSumOptimalSolution(array,target)));
    }

    //bruteforce solution of Two sum problem
    public static int[] twoSumSolution(int[] array, int target){
        for(int i=0; i< array.length; i++){
            for(int j=1; j<array.length;j++){
                if(i!=j){
                    if(array[i]+array[j]==target) return new int[]{i,j};
                }

            }
        }

        return new int[]{};
    }

    public static int[] twoSumOptimalSolution(int[] array, int target){
        //create hashmap
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i< array.length; i++){
            int potentialMatch = target - array[i];
            if(map.containsKey(potentialMatch)) return new int[]{i,map.get(potentialMatch)};
            map.put(array[i],i);
        }
        return new int[]{};
    }
}
