package patterns.p15_greedy;

import java.util.*;

/**
 * ============================================================
 * PATTERN 15: GREEDY
 * ============================================================
 * WHAT IT IS:
 *   Make the locally optimal choice at each step, trusting it leads
 *   to the global optimum. No backtracking — each decision is final.
 *   Greedy works when the problem has "optimal substructure" and
 *   the greedy choice is provably correct.
 *
 * WHEN TO USE:
 *   - Interval scheduling / merging
 *   - Minimizing/maximizing with a clear local rule
 *   - Jump game style (can you reach the end?)
 *   - Activity selection
 *
 * KEY INSIGHT:
 *   Sort first — most greedy algorithms start with sorting to make
 *   the right local choice obvious.
 *   Prove correctness: "choosing X now can never hurt future choices."
 *
 * TIME:  O(n log n) typically (sorting dominates)  |  SPACE: O(1)
 * ============================================================
 *
 * PROBLEMS:
 *   [SOLVED]  Jump Game                   (LC #55)  — Medium
 *   [ TODO ]  Best Time to Buy/Sell II    (LC #122) — Medium
 *   [ TODO ]  Jump Game II               (LC #45)  — Medium
 *   [ TODO ]  Gas Station                 (LC #134) — Medium
 *   [ TODO ]  Non-overlapping Intervals   (LC #435) — Medium
 */
public class Greedy {

    // =========================================================
    // SOLVED EXAMPLE: Jump Game (LC #55) — Medium
    // =========================================================
    // Problem : Given array where nums[i] = max jump from position i,
    //           return true if you can reach the last index starting from 0.
    // Approach: Track the farthest reachable index as you walk.
    //           If current index > farthest → stuck, return false.
    //           If farthest >= last index → return true.
    // Time: O(n)  Space: O(1)
    public boolean canJump(int[] nums) {
        int farthest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) return false; // can't reach here
            farthest = Math.max(farthest, i + nums[i]);
        }
        return true;
    }

    // =========================================================
    // TODO 1: Best Time to Buy and Sell Stock II (LC #122) — Medium
    // =========================================================
    // Problem : You can make multiple transactions (buy then sell).
    //           Maximize total profit.
    // Example : [7,1,5,3,6,4] → 7   (buy@1 sell@5=4, buy@3 sell@6=3)
    // Pattern : Greedy — take every upward slope.
    //           profit += max(0, prices[i] - prices[i-1]) for each day.
    public int maxProfit(int[] prices) {
        // TODO: implement
        return 0;
    }

    // =========================================================
    // TODO 2: Jump Game II (LC #45) — Medium
    // =========================================================
    // Problem : Same setup as Jump Game. Return minimum number of jumps
    //           to reach the last index. Guaranteed to be reachable.
    // Example : [2,3,1,1,4] → 2    (jump 1→3, jump 3→end)
    //           [2,3,0,1,4] → 2
    // Pattern : Greedy BFS levels. Track current range end and
    //           farthest reachable. When you exhaust current range,
    //           make a jump (increment count) and extend range to farthest.
    public int jump(int[] nums) {
        // TODO: implement
        return 0;
    }

    // =========================================================
    // TODO 3: Gas Station (LC #134) — Medium
    // =========================================================
    // Problem : n gas stations in a circle. gas[i] = gas at station i.
    //           cost[i] = gas to travel from i to i+1.
    //           Return starting station index to complete the circuit,
    //           or -1 if impossible. Guaranteed unique answer if possible.
    // Pattern : If total gas >= total cost → solution exists.
    //           Track running sum: when it goes negative, reset start to i+1.
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // TODO: implement
        return -1;
    }

    // =========================================================
    // TODO 4: Non-overlapping Intervals (LC #435) — Medium
    // =========================================================
    // Problem : Given array of intervals, return minimum number of intervals
    //           to remove so the rest are non-overlapping.
    // Example : [[1,2],[2,3],[3,4],[1,3]] → 1   (remove [1,3])
    // Pattern : Sort by end time. Greedily keep intervals that end earliest.
    //           If current interval overlaps with last kept → remove it (count++).
    //           Else → keep it (update last end).
    public int eraseOverlapIntervals(int[][] intervals) {
        // TODO: implement
        return 0;
    }
}
