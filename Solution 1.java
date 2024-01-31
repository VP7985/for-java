//3Sum Closest
/*
 * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.
 */

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] n, int t) {
        // Sort the input array in ascending order
        Arrays.sort(n);
        
        // Initialize variables to store the closest sum and the absolute difference
        int closestSum = Integer.MAX_VALUE;
        int minDifference = 0;

        // Iterate through the array
        for(int i = 0; i < n.length - 2; i++) {
            int left = i + 1;
            int right = n.length - 1;

            // Use two pointers approach to find a triplet sum
            while(left < right) {
                int currentSum = n[i] + n[left] + n[right];

                // Check if the current triplet sum is equal to the target sum
                if(currentSum == t) {
                    return t;
                }
                // Adjust pointers based on the comparison with the target sum
                else if(currentSum > t) {
                    right--;
                } else {
                    left++;
                }

                // Update the absolute difference and closest sum if needed
                int currentDifference = Math.abs(currentSum - t);
                if(currentDifference < minDifference || minDifference == 0) {
                    minDifference = currentDifference;
                    closestSum = currentSum;
                }
            }
        }

        // Return the closest sum
        return closestSum;
    }
}
