package Arrays_and_Hashing;

import java.util.HashMap;

public class Q3_TwoSum {

    //Given an array of integers nums and an integer target,
    // return the indices i and j such that nums[i] + nums[j] == target and i != j.
    //
    //You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
    //
    //Return the answer with the smaller index first.

    //Input: nums = [4,5,6], target = 10
    //
    //Output: [0,2]

    public static void main(String[] args){

        int[] nums = new int[]{4,5,6};
        System.out.println(twoSum(nums,10));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length;i++){

            int diff = target-nums[i];

            if(map.containsKey(diff)){
                res[0]=map.get(diff);
                res[1]=i;
            }

            map.put(nums[i],i);
        }

        return res;
    }

}
