package patterns.p06_hashing;

import java.util.*;

/**
 * ============================================================
 * PATTERN 6: HASHING / HASH MAP
 * ============================================================
 * WHAT IT IS:
 *   Use a HashMap or HashSet to store and look up values in O(1).
 *   Trades space for time — avoids nested loops by remembering
 *   what you've seen so far.
 *
 * WHEN TO USE:
 *   - Finding duplicates or checking membership
 *   - Counting frequencies of elements
 *   - Two-sum style "find complement" problems
 *   - Grouping elements by a key (anagrams, etc.)
 *
 * KEY INSIGHT:
 *   Instead of searching through already-seen elements (O(n) each),
 *   store them in a hash structure for O(1) lookup.
 *   "Have I seen the complement of this?" → HashMap.
 *
 * TIME:  O(n) average  |  SPACE: O(n)
 * ============================================================
 *
 * PROBLEMS:
 *   [SOLVED]  Two Sum                      (LC #1)   — Easy
 *   [ TODO ]  Contains Duplicate           (LC #217) — Easy
 *   [ TODO ]  Valid Anagram                (LC #242) — Easy
 *   [ TODO ]  Group Anagrams               (LC #49)  — Medium
 *   [ TODO ]  Longest Consecutive Sequence (LC #128) — Medium
 */
public class Hashing {

    // =========================================================
    // SOLVED EXAMPLE: Two Sum (LC #1) — Easy
    // =========================================================
    // Problem : Given array and target, return indices of two
    //           numbers that add up to target (exactly one answer).
    // Approach: HashMap from value → index.
    //           For each num, check if (target - num) is in map.
    //           If yes → return both indices. If no → store num.
    // Time: O(n)  Space: O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (seen.containsKey(need)) return new int[]{seen.get(need), i};
            seen.put(nums[i], i);
        }
        return new int[]{};
    }

    // =========================================================
    // TODO 1: Contains Duplicate (LC #217) — Easy
    // =========================================================
    // Problem : Given integer array nums, return true if any value
    //           appears at least twice. False if all distinct.
    // Example : [1,2,3,1] → true     [1,2,3,4] → false
    // Pattern : HashSet — add each element; if already present → true.
    public boolean containsDuplicate(int[] nums) {
        // TODO: implement
        return false;
    }

    // =========================================================
    // TODO 2: Valid Anagram (LC #242) — Easy
    // =========================================================
    // Problem : Given strings s and t, return true if t is an
    //           anagram of s (same characters, same frequencies).
    // Example : s="anagram", t="nagaram" → true
    //           s="rat",     t="car"     → false
    // Pattern : Frequency count array of size 26, or HashMap.
    //           Increment for s, decrement for t → all zeros → true.
    public boolean isAnagram(String s, String t) {
        // TODO: implement
        return false;
    }

    // =========================================================
    // TODO 3: Group Anagrams (LC #49) — Medium
    // =========================================================
    // Problem : Given array of strings, group the anagrams together.
    //           Return list of lists (order doesn't matter).
    // Example : ["eat","tea","tan","ate","nat","bat"]
    //           → [["bat"],["nat","tan"],["ate","eat","tea"]]
    // Pattern : HashMap<String, List<String>> where key = sorted string.
    //           All anagrams of a word share the same sorted key.
    public List<List<String>> groupAnagrams(String[] strs) {
        // TODO: implement
        return new ArrayList<>();
    }

    // =========================================================
    // TODO 4: Longest Consecutive Sequence (LC #128) — Medium
    // =========================================================
    // Problem : Given unsorted array, return length of longest
    //           consecutive elements sequence. Must run in O(n).
    // Example : [100,4,200,1,3,2] → 4   (sequence: 1,2,3,4)
    // Pattern : Put all numbers in a HashSet. For each num that is
    //           the START of a sequence (num-1 not in set), count
    //           how long the sequence extends.
    public int longestConsecutive(int[] nums) {
        // TODO: implement
        return 0;
    }
}
