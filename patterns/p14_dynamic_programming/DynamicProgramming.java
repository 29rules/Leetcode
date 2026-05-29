package patterns.p14_dynamic_programming;

/**
 * ============================================================
 * PATTERN 14: DYNAMIC PROGRAMMING
 * ============================================================
 * WHAT IT IS:
 *   Break problem into overlapping subproblems. Solve each once,
 *   store the result (memoization/tabulation), reuse later.
 *   The key is finding the recurrence relation:
 *   dp[i] = f(dp[i-1], dp[i-2], ...)
 *
 * WHEN TO USE:
 *   - Optimization (min/max) with overlapping subproblems
 *   - Counting ways to achieve something
 *   - "Can you achieve X?" questions with structure
 *   - Subsequence / substring problems
 *
 * KEY INSIGHT:
 *   1. Define what dp[i] means.
 *   2. Find the recurrence (how dp[i] depends on smaller values).
 *   3. Identify base cases.
 *   4. Determine iteration order.
 *   Bottom-up (tabulation) avoids recursion overhead.
 *
 * TIME:  O(n) to O(n²) typically  |  SPACE: O(n) often reducible to O(1)
 * ============================================================
 *
 * PROBLEMS:
 *   [SOLVED]  House Robber                    (LC #198) — Medium
 *   [ TODO ]  Climbing Stairs                 (LC #70)  — Easy
 *   [ TODO ]  Coin Change                     (LC #322) — Medium
 *   [ TODO ]  Longest Increasing Subsequence  (LC #300) — Medium
 *   [ TODO ]  Longest Common Subsequence      (LC #1143)— Medium
 */
public class DynamicProgramming {

    // =========================================================
    // SOLVED EXAMPLE: House Robber (LC #198) — Medium
    // =========================================================
    // Problem : Can't rob two adjacent houses. Given amounts in each
    //           house, return max money you can rob.
    // Approach: dp[i] = max money robbing first i houses.
    //           dp[i] = max(dp[i-1], dp[i-2] + nums[i])
    //           Either skip house i (dp[i-1]) or rob it (dp[i-2] + nums[i]).
    // Optimized to O(1) space using two variables.
    // Time: O(n)  Space: O(1)
    public int rob(int[] nums) {
        int prev2 = 0, prev1 = 0;
        for (int num : nums) {
            int curr = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    // =========================================================
    // TODO 1: Climbing Stairs (LC #70) — Easy
    // =========================================================
    // Problem : You can climb 1 or 2 steps. How many distinct ways
    //           to reach the top of n stairs?
    // Example : n=2 → 2   (1+1, 2)     n=3 → 3   (1+1+1, 1+2, 2+1)
    // Pattern : dp[n] = dp[n-1] + dp[n-2]  ← Fibonacci!
    //           Base: dp[1]=1, dp[2]=2
    public int climbStairs(int n) {
        // TODO: implement
        return 0;
    }

    // =========================================================
    // TODO 2: Coin Change (LC #322) — Medium
    // =========================================================
    // Problem : Given coins of different denominations and amount,
    //           return the fewest coins needed to make up amount.
    //           Return -1 if not possible.
    // Example : coins=[1,5,11], amount=15 → 3   (5+5+5? No, 11+1+1+1+1? No wait...
    //           actually coins=[1,5,11], amount=15 → 3 coins: 11+3? Hmm 1+1+1=3 not right
    //           [1,2,5], amount=11 → 3 coins (5+5+1)
    // Pattern : dp[i] = min coins to make amount i.
    //           dp[i] = min over all coins c: dp[i-c] + 1.
    //           Base: dp[0]=0. Init all others to amount+1 (infinity).
    public int coinChange(int[] coins, int amount) {
        // TODO: implement
        return -1;
    }

    // =========================================================
    // TODO 3: Longest Increasing Subsequence (LC #300) — Medium
    // =========================================================
    // Problem : Given integer array, return length of longest strictly
    //           increasing subsequence (not necessarily contiguous).
    // Example : [10,9,2,5,3,7,101,18] → 4   ([2,5,7,101] or [2,3,7,18])
    // Pattern : dp[i] = LIS ending at index i.
    //           dp[i] = max(dp[j]+1) for all j < i where nums[j] < nums[i].
    //           Answer = max(dp).
    // O(n²) solution; O(n log n) exists with binary search (patience sort).
    public int lengthOfLIS(int[] nums) {
        // TODO: implement
        return 0;
    }

    // =========================================================
    // TODO 4: Longest Common Subsequence (LC #1143) — Medium
    // =========================================================
    // Problem : Given strings text1 and text2, return length of their
    //           longest common subsequence. LCS need not be contiguous.
    // Example : text1="abcde", text2="ace" → 3   (a,c,e)
    //           text1="abc",   text2="abc" → 3
    //           text1="abc",   text2="def" → 0
    // Pattern : 2D DP table. dp[i][j] = LCS of text1[0..i-1], text2[0..j-1].
    //           If chars match: dp[i][j] = dp[i-1][j-1] + 1.
    //           Else:          dp[i][j] = max(dp[i-1][j], dp[i][j-1]).
    public int longestCommonSubsequence(String text1, String text2) {
        // TODO: implement
        return 0;
    }
}
