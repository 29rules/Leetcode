package patterns.p02_sliding_window;

import java.util.*;

/**
 * ============================================================
 * PATTERN 2: SLIDING WINDOW
 * ============================================================
 * WHAT IT IS:
 *   A contiguous window (subarray/substring) expands by moving
 *   right and shrinks by moving left. Update incrementally —
 *   add new element on right, remove one falling off left.
 *   Collapses O(n·k) or O(n²) brute-force into O(n).
 *
 * WHEN TO USE:
 *   - Longest/shortest contiguous subarray satisfying a property
 *   - Max/min/sum over every fixed-size window of size k
 *   - Counting distinct elements in a window / frequency condition
 *   - "Contiguous" + "longest" / "shortest" / "max" / "min"
 *
 * KEY INSIGHT:
 *   Expand greedily with right. The moment window is invalid,
 *   shrink from left until valid again.
 *   Each index visited at most twice — once by right, once by left.
 *
 * TIME:  O(n)  |  SPACE: O(k) where k = alphabet/window size
 * ============================================================
 *
 * PROBLEMS:
 *   [SOLVED]  Longest Substring Without Repeating Characters (LC #3)   — Medium
 *   [ TODO ]  Best Time to Buy and Sell Stock               (LC #121)  — Easy
 *   [ TODO ]  Longest Repeating Character Replacement       (LC #424)  — Medium
 *   [ TODO ]  Permutation in String                         (LC #567)  — Medium
 *   [ TODO ]  Minimum Window Substring                      (LC #76)   — Hard
 */
public class SlidingWindow {

    // =========================================================
    // SOLVED EXAMPLE: Longest Substring Without Repeating Chars (#3)
    // =========================================================
    // Problem : Given string s, find the length of the longest
    //           substring with no repeating characters.
    // Approach: Slide window. Track chars in a Set.
    //           Move right forward, add s[right].
    //           If duplicate found, shrink from left until gone.
    //           Track max window size.
    // Time: O(n)  Space: O(k)
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0, best = 0;
        for (int right = 0; right < s.length(); right++) {
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            best = Math.max(best, right - left + 1);
        }
        return best;
    }

    // =========================================================
    // TODO 1: Best Time to Buy and Sell Stock (LC #121) — Easy
    // =========================================================
    // Problem : Given prices[i] = price on day i, find the max
    //           profit from one buy-low sell-high transaction.
    //           Return 0 if no profit possible.
    // Example : [7,1,5,3,6,4] → 5   (buy day 2, sell day 5)
    //           [7,6,4,3,1]   → 0   (no profit possible)
    // Pattern : Sliding window or single pass: track minPrice so far,
    //           update maxProfit = max(maxProfit, price - minPrice).
    public int maxProfit(int[] prices) {
        // TODO: implement
        return 0;
    }

    // =========================================================
    // TODO 2: Longest Repeating Character Replacement (LC #424) — Medium
    // =========================================================
    // Problem : Given string s and integer k, you can replace at most
    //           k characters. Return the length of the longest substring
    //           containing the same letter after replacements.
    // Example : "AABABBA", k=1 → 4   ("AABA" or "ABBA")
    // Pattern : Sliding window + frequency map.
    //           Window is valid when: (windowLen - maxFreq) <= k
    //           If invalid, shrink left.
    public int characterReplacement(String s, int k) {
        // TODO: implement
        return 0;
    }

    // =========================================================
    // TODO 3: Permutation in String (LC #567) — Medium
    // =========================================================
    // Problem : Given strings s1 and s2, return true if s2 contains
    //           a permutation of s1 (as a substring).
    // Example : s1="ab", s2="eidbaooo" → true  ("ba" is in s2)
    //           s1="ab", s2="eidboaoo" → false
    // Pattern : Fixed-size sliding window of size s1.length().
    //           Compare frequency arrays of window vs s1.
    public boolean checkInclusion(String s1, String s2) {
        // TODO: implement
        return false;
    }

    // =========================================================
    // TODO 4: Minimum Window Substring (LC #76) — Hard
    // =========================================================
    // Problem : Given strings s and t, return the minimum window
    //           substring of s such that every character in t
    //           (including duplicates) is included. If none, return "".
    // Example : s="ADOBECODEBANC", t="ABC" → "BANC"
    // Pattern : Variable sliding window + two frequency maps.
    //           Expand right; once all chars covered, shrink left
    //           to minimize window while still valid.
    public String minWindow(String s, String t) {
        // TODO: implement
        return "";
    }
}
