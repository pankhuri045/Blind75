package Arrays_and_Hashing;

import java.util.HashSet;

public class Q1_ContainsDuplicate {

    //Given an integer array nums, return true if any value appears more than once in the array,
    // otherwise return false.

    //Input: nums = [1, 2, 3, 3]
    //Output: true

    public static void main(String[] args){

        int[] nums = new int[]{1,2,3,3};
        System.out.println(hasDuplicate(nums));
    }

    public static boolean hasDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            if(!set.contains(num))
                set.add(num);
            else
                return true;
        }
        return false;
    }
}
