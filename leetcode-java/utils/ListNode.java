package utils;

/**
 * Singly-linked list node used across linked list problems.
 * Copy this class into any solution file that needs it when submitting to LeetCode.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    /** Helper: build a ListNode chain from an int array. */
    public static ListNode of(int... vals) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (int v : vals) { cur.next = new ListNode(v); cur = cur.next; }
        return dummy.next;
    }

    /** Helper: print the list as [1 -> 2 -> 3]. */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode cur = this;
        while (cur != null) {
            sb.append(cur.val);
            if (cur.next != null) sb.append(" -> ");
            cur = cur.next;
        }
        return "[" + sb + "]";
    }
}
