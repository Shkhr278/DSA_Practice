package DSA;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {  // Renamed from TwoSum to Solution
    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store the number and its index
        Map<Integer, Integer> map = new HashMap<>();

        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement needed to achieve the target
            int complement = target - nums[i];

            // If the complement exists in the map, we have found the solution
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // If complement not found, add the current number and its index to the map
            map.put(nums[i], i);
        }

        // If no solution is found, throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        // Example test cases
        Solution sol = new Solution();
        
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = sol.twoSum(nums1, target1);
        System.out.println("Indices: [" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = sol.twoSum(nums2, target2);
        System.out.println("Indices: [" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = sol.twoSum(nums3, target3);
        System.out.println("Indices: [" + result3[0] + ", " + result3[1] + "]");
    }
}
