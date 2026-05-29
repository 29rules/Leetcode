package patterns.p12_backtracking;

import java.util.*;

/**
 * ============================================================
 * PATTERN 12: BACKTRACKING
 * ============================================================
 * WHAT IT IS:
 *   Build a solution incrementally. At each step, try all valid choices.
 *   If a choice leads to an invalid state → backtrack (undo it) and try next.
 *   Explores the decision tree — prune branches that can't lead to a solution.
 *
 * WHEN TO USE:
 *   - Generating all permutations, combinations, subsets
 *   - Constraint satisfaction (N-Queens, Sudoku)
 *   - Word search in a grid
 *   - Anything needing "try all possibilities"
 *
 * KEY INSIGHT:
 *   Template:
 *     void backtrack(state, choices) {
 *         if (base case) { save result; return; }
 *         for each choice:
 *             make choice
 *             backtrack(new state, remaining choices)
 *             undo choice  ← this is the backtrack step
 *     }
 *
 * TIME:  O(n! or 2^n)  |  SPACE: O(n) for recursion depth
 * ============================================================
 *
 * PROBLEMS:
 *   [SOLVED]  Subsets           (LC #78)  — Medium
 *   [ TODO ]  Permutations      (LC #46)  — Medium
 *   [ TODO ]  Combination Sum   (LC #39)  — Medium
 *   [ TODO ]  Word Search       (LC #79)  — Medium
 *   [ TODO ]  N-Queens          (LC #51)  — Hard
 */
public class Backtracking {

    // =========================================================
    // SOLVED EXAMPLE: Subsets (LC #78) — Medium
    // =========================================================
    // Problem : Given integer array nums (distinct), return all possible subsets.
    // Approach: Backtrack. At each step, either include nums[i] or not.
    //           Start from index, add each element and recurse deeper.
    //           Add current path to result at every call (not just base case).
    // Time: O(n * 2^n)  Space: O(n)
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrackSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrackSubsets(int[] nums, int start, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path)); // add current subset (including empty)
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);                           // choose
            backtrackSubsets(nums, i + 1, path, result); // explore
            path.remove(path.size() - 1);                // un-choose (backtrack)
        }
    }

    // =========================================================
    // TODO 1: Permutations (LC #46) — Medium
    // =========================================================
    // Problem : Given array of distinct integers, return all permutations.
    // Example : [1,2,3] → [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    // Pattern : At each step, try every unused number.
    //           Track which are used with a boolean array or by swapping.
    public List<List<Integer>> permute(int[] nums) {
        // TODO: implement
        return new ArrayList<>();
    }

    // =========================================================
    // TODO 2: Combination Sum (LC #39) — Medium
    // =========================================================
    // Problem : Given array of distinct integers and a target,
    //           return all unique combinations that sum to target.
    //           Same number can be used unlimited times.
    // Example : candidates=[2,3,6,7], target=7 → [[2,2,3],[7]]
    // Pattern : Backtrack. At each step, try each candidate >= current index.
    //           Allow reuse by not advancing start index.
    //           Prune if remaining < 0.
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // TODO: implement
        return new ArrayList<>();
    }

    // =========================================================
    // TODO 3: Word Search (LC #79) — Medium
    // =========================================================
    // Problem : Given m×n grid of characters and a word, return true
    //           if word exists in the grid (horizontally/vertically adjacent,
    //           each cell used at most once).
    // Example : board=[["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
    //           word="ABCCED" → true
    // Pattern : Backtrack DFS from each cell. Mark visited temporarily.
    //           Restore on backtrack.
    public boolean exist(char[][] board, String word) {
        // TODO: implement
        return false;
    }

    // =========================================================
    // TODO 4: N-Queens (LC #51) — Hard
    // =========================================================
    // Problem : Place n queens on n×n board so no two queens attack each other.
    //           Return all distinct solutions (each as a list of strings).
    // Pattern : Place one queen per row. Track which columns, diagonals,
    //           and anti-diagonals are already occupied with HashSets.
    //           Backtrack if no valid column in current row.
    public List<List<String>> solveNQueens(int n) {
        // TODO: implement
        return new ArrayList<>();
    }
}
