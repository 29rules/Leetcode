package patterns.p07_stack;

import java.util.*;

/**
 * ============================================================
 * PATTERN 7: STACK & MONOTONIC STACK
 * ============================================================
 * WHAT IT IS:
 *   A stack processes elements LIFO. A monotonic stack maintains
 *   elements in increasing or decreasing order — when a new element
 *   violates the order, pop until restored. This efficiently finds
 *   "next greater/smaller" elements in O(n) instead of O(n²).
 *
 * WHEN TO USE:
 *   - Matching brackets/parentheses
 *   - Evaluating expressions (reverse polish notation)
 *   - Next greater element / previous smaller element
 *   - Largest rectangle in histogram
 *   - Temperature problems ("how many days until warmer")
 *
 * KEY INSIGHT:
 *   Monotonic stack: each element is pushed and popped at most once
 *   → O(n) total. Pop when the current element can "answer" the
 *   question for the element being popped.
 *
 * TIME:  O(n)  |  SPACE: O(n)
 * ============================================================
 *
 * PROBLEMS:
 *   [SOLVED]  Daily Temperatures               (LC #739) — Medium
 *   [ TODO ]  Valid Parentheses                (LC #20)  — Easy
 *   [ TODO ]  Min Stack                        (LC #155) — Medium
 *   [ TODO ]  Evaluate Reverse Polish Notation (LC #150) — Medium
 *   [ TODO ]  Largest Rectangle in Histogram   (LC #84)  — Hard
 */
public class StackProblems {

    // =========================================================
    // SOLVED EXAMPLE: Daily Temperatures (LC #739) — Medium
    // =========================================================
    // Problem : Given daily temperatures, return array where
    //           answer[i] = days until a warmer temperature.
    //           If no warmer day, answer[i] = 0.
    // Approach: Monotonic decreasing stack of indices.
    //           When temps[i] > temps[stack.peek()], pop and record
    //           the difference in indices as the answer.
    // Time: O(n)  Space: O(n)
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>(); // stores indices
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }
        return answer;
    }

    // =========================================================
    // TODO 1: Valid Parentheses (LC #20) — Easy
    // =========================================================
    // Problem : Given string of '(', ')', '{', '}', '[', ']',
    //           return true if it is valid (properly opened/closed).
    // Example : "()" → true    "()[]{}" → true    "(]" → false
    // Pattern : Stack — push opening brackets; on closing bracket,
    //           check if top of stack matches. If not → invalid.
    public boolean isValid(String s) {
        // TODO: implement
        return false;
    }

    // =========================================================
    // TODO 2: Min Stack (LC #155) — Medium
    // =========================================================
    // Problem : Design a stack that supports push, pop, top, and
    //           retrieving the minimum element in O(1).
    // Pattern : Use a second stack that tracks minimums.
    //           minStack.peek() always holds the current minimum.
    // Implement as inner class or separate class.
    static class MinStack {
        // TODO: implement fields

        public MinStack() {
            // TODO
        }

        public void push(int val) {
            // TODO
        }

        public void pop() {
            // TODO
        }

        public int top() {
            // TODO
            return -1;
        }

        public int getMin() {
            // TODO
            return -1;
        }
    }

    // =========================================================
    // TODO 3: Evaluate Reverse Polish Notation (LC #150) — Medium
    // =========================================================
    // Problem : Evaluate expression in Reverse Polish Notation.
    //           Valid operators: +, -, *, /. Division truncates toward zero.
    // Example : ["2","1","+","3","*"] → 9      ((2+1)*3)
    //           ["4","13","5","/","+"] → 6     (4+(13/5))
    // Pattern : Stack. On number: push. On operator: pop two, apply, push result.
    public int evalRPN(String[] tokens) {
        // TODO: implement
        return 0;
    }

    // =========================================================
    // TODO 4: Largest Rectangle in Histogram (LC #84) — Hard
    // =========================================================
    // Problem : Given array of bar heights, find the largest
    //           rectangle that can be formed in the histogram.
    // Example : [2,1,5,6,2,3] → 10    (heights 5 and 6, width 2)
    // Pattern : Monotonic increasing stack of indices.
    //           When bar shorter than stack top: pop and compute
    //           rectangle with popped height as smallest bar.
    //           Width = current index - new stack top - 1.
    public int largestRectangleArea(int[] heights) {
        // TODO: implement
        return 0;
    }
}
