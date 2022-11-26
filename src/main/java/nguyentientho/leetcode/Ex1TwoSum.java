package nguyentientho.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex1TwoSum {
    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 11, 15, 3, 6, 90, 17, 1, 8}, 9);
        System.out.println(Arrays.toString(result));
    }

    // solution 1
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        // no solution, just return null
        return null;
    }

    // solution 2
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i, map.get(complement) };
            }
        }
        return null;
    }
}
