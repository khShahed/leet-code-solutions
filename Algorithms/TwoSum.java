package Algorithms;

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int[] result = new int[2];

        for (int index = 0; index < nums.length; index++){
            int requiredNum = target - nums[index];

            if (numMap.containsKey(requiredNum)){
                result[0] = numMap.get(requiredNum);
                result[1] = index;
                break;
            }

            numMap.put(nums[index], index);
        }
        return result;
    }
}