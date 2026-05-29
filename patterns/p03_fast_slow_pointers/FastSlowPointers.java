package patterns.p03_fast_slow_pointers;

/**
 * ============================================================
 * PATTERN 3: FAST & SLOW POINTERS (Floyd's Cycle Detection)
 * ============================================================
 * WHAT IT IS:
 *   Two pointers traverse at different speeds — slow moves 1 step,
 *   fast moves 2. If a cycle exists, fast laps slow and they meet.
 *   If no cycle, fast reaches null. Detects cycles, finds midpoints,
 *   and locates cycle entry nodes in O(1) space.
 *
 * WHEN TO USE:
 *   - Detecting a cycle in a linked list
 *   - Finding the middle node of a linked list in one pass
 *   - Finding the start of a cycle
 *   - Detecting duplicates in arrays (treating as implicit linked list)
 *
 * KEY INSIGHT:
 *   When slow moves k steps, fast moves 2k. If they meet inside
 *   cycle of length L, the meeting point is predictable.
 *   Reset one pointer to head, move both one step → they meet at entry.
 *
 * TIME:  O(n)  |  SPACE: O(1)
 * ============================================================
 *
 * PROBLEMS:
 *   [SOLVED]  Linked List Cycle      (LC #141) — Easy
 *   [ TODO ]  Middle of Linked List  (LC #876) — Easy
 *   [ TODO ]  Happy Number           (LC #202) — Easy
 *   [ TODO ]  Linked List Cycle II   (LC #142) — Medium
 *   [ TODO ]  Find the Duplicate     (LC #287) — Medium
 */
public class FastSlowPointers {

    static class ListNode {
        int val; ListNode next;
        ListNode(int v) { val = v; }
    }

    // =========================================================
    // SOLVED EXAMPLE: Linked List Cycle (LC #141) — Easy
    // =========================================================
    // Problem : Given head of linked list, return true if it has a cycle.
    // Approach: slow and fast start at head.
    //           slow moves 1 step, fast moves 2.
    //           If fast or fast.next == null → no cycle.
    //           If slow == fast → cycle detected.
    // Time: O(n)  Space: O(1)
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    // =========================================================
    // TODO 1: Middle of the Linked List (LC #876) — Easy
    // =========================================================
    // Problem : Given head of linked list, return the middle node.
    //           If two middle nodes, return the second.
    // Example : [1,2,3,4,5] → node 3    [1,2,3,4] → node 3
    // Pattern : fast & slow. When fast reaches end, slow is at middle.
    public ListNode middleNode(ListNode head) {
        // TODO: implement
        return null;
    }

    // =========================================================
    // TODO 2: Happy Number (LC #202) — Easy
    // =========================================================
    // Problem : A happy number: replace the number by the sum of squares
    //           of its digits. Repeat until it equals 1 (happy) or loops
    //           endlessly (not happy). Return true if happy.
    // Example : 19 → 1²+9²=82 → 8²+2²=68 → ... → 1  → true
    //           2  → ... → cycles and never reaches 1  → false
    // Pattern : Treat digit-square sequence as implicit linked list.
    //           fast & slow detect the cycle. If slow==1 → happy.
    public boolean isHappy(int n) {
        // TODO: implement
        return false;
    }

    // =========================================================
    // TODO 3: Linked List Cycle II (LC #142) — Medium
    // =========================================================
    // Problem : Given head of linked list with a cycle, return the node
    //           where the cycle begins. If no cycle, return null.
    // Pattern : Detect cycle with fast/slow. When they meet, reset one
    //           pointer to head. Move both one step → meet at entry node.
    public ListNode detectCycle(ListNode head) {
        // TODO: implement
        return null;
    }

    // =========================================================
    // TODO 4: Find the Duplicate Number (LC #287) — Medium
    // =========================================================
    // Problem : Given array of n+1 integers where each is in [1,n],
    //           find the one duplicate without modifying the array.
    //           Use only O(1) extra space.
    // Example : [1,3,4,2,2] → 2     [3,1,3,4,2] → 3
    // Pattern : Treat array as linked list (index → nums[index]).
    //           Duplicate creates a cycle. Floyd's finds it.
    public int findDuplicate(int[] nums) {
        // TODO: implement
        return -1;
    }
}
