package patterns.p10_tree_bfs;

import java.util.*;

/**
 * ============================================================
 * PATTERN 10: TREE BFS (Level-Order Traversal)
 * ============================================================
 * WHAT IT IS:
 *   Process a tree level by level using a Queue.
 *   Each iteration processes all nodes at the current level,
 *   then enqueues their children for the next level.
 *
 * WHEN TO USE:
 *   - Level-order traversal (obvious one)
 *   - Finding the shortest path in an unweighted tree
 *   - Right side view of a tree
 *   - Average/sum of each level
 *   - Minimum depth of a binary tree
 *   - Zigzag traversal
 *
 * KEY INSIGHT:
 *   Queue size at the start of each outer loop iteration = nodes at that level.
 *   Process exactly that many nodes, then you've completed one full level.
 *
 * TIME:  O(n)  |  SPACE: O(w) where w = max width of tree
 * ============================================================
 *
 * PROBLEMS:
 *   [SOLVED]  Binary Tree Level Order Traversal     (LC #102) — Medium
 *   [ TODO ]  Average of Levels in Binary Tree      (LC #637) — Easy
 *   [ TODO ]  Minimum Depth of Binary Tree           (LC #111) — Easy
 *   [ TODO ]  Binary Tree Right Side View            (LC #199) — Medium
 *   [ TODO ]  Binary Tree Zigzag Level Order         (LC #103) — Medium
 */
public class TreeBFS {

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }

    // =========================================================
    // SOLVED EXAMPLE: Binary Tree Level Order Traversal (LC #102)
    // =========================================================
    // Problem : Given root, return level-order traversal as
    //           list of lists (each inner list = one level).
    // Approach: BFS with a queue. At start of each level,
    //           note queue size = # nodes at this level.
    //           Process exactly that many → one level complete.
    // Time: O(n)  Space: O(n)
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size(); // nodes at this level
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left  != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            result.add(level);
        }
        return result;
    }

    // =========================================================
    // TODO 1: Average of Levels in Binary Tree (LC #637) — Easy
    // =========================================================
    // Problem : Given root, return list of averages of each level.
    // Example : [3,9,20,null,null,15,7] → [3.0, 14.5, 11.0]
    // Pattern : Standard BFS level-by-level; compute average per level.
    public List<Double> averageOfLevels(TreeNode root) {
        // TODO: implement
        return new ArrayList<>();
    }

    // =========================================================
    // TODO 2: Minimum Depth of Binary Tree (LC #111) — Easy
    // =========================================================
    // Problem : Return the minimum depth (root to nearest leaf).
    // Example : [3,9,20,null,null,15,7] → 2
    // Pattern : BFS — return depth when first LEAF node is found.
    //           (A leaf has no children.)
    // Note    : DFS would also work but BFS is optimal here — stops early.
    public int minDepth(TreeNode root) {
        // TODO: implement
        return 0;
    }

    // =========================================================
    // TODO 3: Binary Tree Right Side View (LC #199) — Medium
    // =========================================================
    // Problem : Given root, imagine standing on the right side.
    //           Return values of nodes visible from the right (one per level).
    // Example : [1,2,3,null,5,null,4] → [1,3,4]
    // Pattern : BFS level-by-level; capture the LAST node of each level.
    public List<Integer> rightSideView(TreeNode root) {
        // TODO: implement
        return new ArrayList<>();
    }

    // =========================================================
    // TODO 4: Binary Tree Zigzag Level Order (LC #103) — Medium
    // =========================================================
    // Problem : Level-order traversal but alternate direction each level.
    //           Odd levels: left-to-right. Even levels: right-to-left.
    // Example : [3,9,20,null,null,15,7] → [[3],[20,9],[15,7]]
    // Pattern : BFS with a flag. Use LinkedList and addFirst() vs addLast()
    //           depending on direction flag. Flip flag each level.
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // TODO: implement
        return new ArrayList<>();
    }
}
