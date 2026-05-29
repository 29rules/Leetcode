package patterns.p01_two_pointers;

/**
 * ============================================================
 * PATTERN 1: TWO POINTERS
 * ============================================================
 * WHAT IT IS:
 *   Two indices move through an array/string — usually toward
 *   each other from opposite ends, or together at different speeds.
 *   Turns O(n²) brute-force into O(n).
 *
 * WHEN TO USE:
 *   - Finding pairs/triplets that satisfy a condition (sum to target)
 *   - Checking palindromes or comparing string halves
 *   - Reversing or rearranging an array in-place
 *   - Squeezing a search space from both sides
 *
 * KEY INSIGHT:
 *   If the array is sorted and you need a pair with target sum,
 *   moving left right increases the sum, moving right left
 *   decreases it — each step eliminates one possibility.
 *
 * TIME:  O(n)  |  SPACE: O(1)
 * ============================================================
 *
 * FILES IN THIS FOLDER:
 *   TwoPointers.java              — this file (solved example + stubs)
 *
 * PROBLEMS:
 *   [SOLVED]  Two Sum II – Input Array Is Sorted  (LC #167) — Medium
 *   [ TODO ]  Valid Palindrome                    (LC #125) — Easy
 *   [ TODO ]  3Sum                                (LC #15)  — Medium
 *   [ TODO ]  Container With Most Water           (LC #11)  — Medium
 *   [ TODO ]  Trapping Rain Water                 (LC #42)  — Hard
 */
public class TwoPointers {

    // =========================================================
    // SOLVED EXAMPLE: Two Sum II – Input Array Is Sorted (#167)
    // =========================================================
    // Problem : 1-indexed sorted array → return indices of two
    //           numbers that add up to target. Exactly one answer.
    // Approach: Left pointer at start, right at end.
    //           sum < target → move left right (need bigger).
    //           sum > target → move right left (need smaller).
    //           sum == target → return pair.
    // Time: O(n)  Space: O(1)
    public int[] twoSumII(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target)  return new int[]{left + 1, right + 1}; // 1-indexed
            else if (sum < target) left++;   // need a larger sum
            else                   right--;  // need a smaller sum
        }
        return new int[]{};
    }

    // =========================================================
    // TODO 1: Valid Palindrome (LC #125) — Easy
    // =========================================================
    // Problem : A phrase is a palindrome if, after converting all
    //           uppercase to lowercase and removing all non-alphanumeric
    //           characters, it reads the same forward and backward.
    //           Given string s, return true if it is a palindrome.
    // Example : "A man, a plan, a canal: Panama" → true
    //           "race a car"                      → false
    // Pattern : Two pointers from both ends; skip non-alphanumeric.
    // Hint    : Use Character.isLetterOrDigit() and Character.toLowerCase()
    public boolean isPalindrome(String s) {
        // TODO: implement
        return false;
    }

    // =========================================================
    // TODO 2: 3Sum (LC #15) — Medium
    // =========================================================
    // Problem : Given integer array nums, return all triplets
    //           [nums[i], nums[j], nums[k]] such that i≠j≠k≠i
    //           and nums[i]+nums[j]+nums[k] == 0. No duplicates.
    // Example : [-1,0,1,2,-1,-4] → [[-1,-1,2],[-1,0,1]]
    // Pattern : Sort first, then for each element fix it and use
    //           two pointers on the rest.
    // Hint    : Skip duplicate values to avoid duplicate triplets.
    public java.util.List<java.util.List<Integer>> threeSum(int[] nums) {
        // TODO: implement
        return new java.util.ArrayList<>();
    }

    // =========================================================
    // TODO 3: Container With Most Water (LC #11) — Medium
    // =========================================================
    // Problem : Given n non-negative integers representing heights
    //           of vertical lines, find two lines that together with
    //           the x-axis form a container that holds the most water.
    // Example : [1,8,6,2,5,4,8,3,7] → 49
    // Pattern : Left and right pointers; always move the shorter line
    //           inward (moving the taller one can only decrease area).
    public int maxArea(int[] height) {
        // TODO: implement
        return 0;
    }

    // =========================================================
    // TODO 4: Trapping Rain Water (LC #42) — Hard
    // =========================================================
    // Problem : Given n non-negative integers representing elevation
    //           map where width of each bar is 1, compute how much
    //           water it can trap after raining.
    // Example : [0,1,0,2,1,0,1,3,2,1,2,1] → 6
    // Pattern : Two pointers + track maxLeft and maxRight.
    //           Water at position i = min(maxLeft, maxRight) - height[i]
    // Hint    : Process the side with the smaller max height first.
    public int trap(int[] height) {
        // TODO: implement
        return 0;
    }
}
