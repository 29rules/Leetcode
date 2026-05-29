package patterns.p04_prefix_sum;

import java.util.*;

/**
 * ============================================================
 * PATTERN 4: PREFIX SUM
 * ============================================================
 * WHAT IT IS:
 *   Precompute cumulative sums so any range sum = single subtraction.
 *   Combined with a HashMap, answers "how many subarrays sum to k?"
 *   in O(n). Generalizes to prefix XOR, prefix product, 2D prefix.
 *
 * WHEN TO USE:
 *   - Many range-sum queries on a static array
 *   - Counting subarrays whose sum equals a target
 *   - Finding longest subarray with a given sum
 *   - "Product except self" style problems
 *
 * KEY INSIGHT:
 *   prefix[i] = sum of first i elements.
 *   sum(l..r) = prefix[r+1] - prefix[l]
 *   To count subarrays summing to k: for each prefix p,
 *   look for how many earlier prefixes equal (p - k) → HashMap.
 *
 * TIME:  O(n)  |  SPACE: O(n)
 * ============================================================
 *
 * PROBLEMS:
 *   [SOLVED]  Subarray Sum Equals K              (LC #560) — Medium
 *   [ TODO ]  Running Sum of 1d Array            (LC #1480)— Easy
 *   [ TODO ]  Find Pivot Index                   (LC #724) — Easy
 *   [ TODO ]  Product of Array Except Self       (LC #238) — Medium
 *   [ TODO ]  Contiguous Array                   (LC #525) — Medium
 */
public class PrefixSum {

    // =========================================================
    // SOLVED EXAMPLE: Subarray Sum Equals K (LC #560) — Medium
    // =========================================================
    // Problem : Given int array and k, return total count of
    //           contiguous subarrays whose sum equals k.
    // Approach: Walk array tracking running prefix sum.
    //           For each prefix p, count of subarrays ending here
    //           with sum k = how many earlier prefixes equal (p - k).
    //           Store prefix-sum frequencies in a HashMap.
    // Time: O(n)  Space: O(n)
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1); // empty prefix
        int prefix = 0, result = 0;
        for (int num : nums) {
            prefix += num;
            result += counts.getOrDefault(prefix - k, 0);
            counts.put(prefix, counts.getOrDefault(prefix, 0) + 1);
        }
        return result;
    }

    // =========================================================
    // TODO 1: Running Sum of 1d Array (LC #1480) — Easy
    // =========================================================
    // Problem : Given array nums, return running sum where
    //           runningSum[i] = sum(nums[0..i]).
    // Example : [1,2,3,4] → [1,3,6,10]
    // Pattern : Build prefix sum in-place or into a new array.
    public int[] runningSum(int[] nums) {
        // TODO: implement
        return new int[]{};
    }

    // =========================================================
    // TODO 2: Find Pivot Index (LC #724) — Easy
    // =========================================================
    // Problem : Return the leftmost index such that the sum of
    //           all elements to its left equals sum to its right.
    //           Return -1 if no such index exists.
    // Example : [1,7,3,6,5,6] → 3   (1+7+3 == 5+6)
    // Pattern : totalSum - leftSum - nums[i] == leftSum
    //           → totalSum == 2*leftSum + nums[i]
    public int pivotIndex(int[] nums) {
        // TODO: implement
        return -1;
    }

    // =========================================================
    // TODO 3: Product of Array Except Self (LC #238) — Medium
    // =========================================================
    // Problem : Given array nums, return array answer where
    //           answer[i] = product of all elements except nums[i].
    //           Must run in O(n) with no division operator.
    // Example : [1,2,3,4] → [24,12,8,6]
    // Pattern : Two passes: left prefix products then right suffix products.
    public int[] productExceptSelf(int[] nums) {
        // TODO: implement
        return new int[]{};
    }

    // =========================================================
    // TODO 4: Contiguous Array (LC #525) — Medium
    // =========================================================
    // Problem : Given binary array nums, return max length of
    //           contiguous subarray with equal 0s and 1s.
    // Example : [0,1,0] → 2     [0,1] → 2
    // Pattern : Replace 0 with -1. Now problem = longest subarray
    //           with sum 0. Use prefix sum + HashMap for first occurrence.
    public int findMaxLength(int[] nums) {
        // TODO: implement
        return 0;
    }
}
