package patterns.p09_tree_dfs;

/**
 * ============================================================
 * PATTERN 9: TREE DFS (Depth-First Search / Recursion)
 * ============================================================
 * WHAT IT IS:
 *   Traverse a tree by going deep before going wide.
 *   Naturally expressed as recursion: process node, recurse left, recurse right.
 *   Pre-order (node-left-right), In-order (left-node-right),
 *   Post-order (left-right-node).
 *
 * WHEN TO USE:
 *   - Computing properties of trees (height, diameter, path sum)
 *   - Validating tree properties (BST check, symmetry)
 *   - Path finding in trees
 *   - Transforming trees (invert, serialize)
 *
 * KEY INSIGHT:
 *   Most tree problems have two cases: base case (null → return 0/null/true)
 *   and recursive case (combine results from left and right subtrees).
 *   Think about what information you need to RETURN from each subtree.
 *
 * TIME:  O(n)  |  SPACE: O(h) where h = tree height (call stack)
 * ============================================================
 *
 * PROBLEMS:
 *   [SOLVED]  Maximum Depth of Binary Tree  (LC #104) — Easy
 *   [ TODO ]  Same Tree                     (LC #100) — Easy
 *   [ TODO ]  Invert Binary Tree            (LC #226) — Easy
 *   [ TODO ]  Diameter of Binary Tree       (LC #543) — Easy
 *   [ TODO ]  Validate Binary Search Tree   (LC #98)  — Medium
 */
public class TreeDFS {

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
        TreeNode(int v, TreeNode l, TreeNode r) { val=v; left=l; right=r; }
    }

    // =========================================================
    // SOLVED EXAMPLE: Maximum Depth of Binary Tree (LC #104) — Easy
    // =========================================================
    // Problem : Given root of binary tree, return its maximum depth
    //           (number of nodes along longest root-to-leaf path).
    // Approach: If root is null → depth 0.
    //           Else: 1 + max(depth(left), depth(right)).
    // Time: O(n)  Space: O(h)
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    // =========================================================
    // TODO 1: Same Tree (LC #100) — Easy
    // =========================================================
    // Problem : Given roots of two binary trees p and q, return true
    //           if they are structurally identical with same values.
    // Example : p=[1,2,3], q=[1,2,3] → true
    //           p=[1,2],   q=[1,null,2] → false
    // Pattern : Both null → true. One null → false. Values differ → false.
    //           Recurse on both left and right.
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // TODO: implement
        return false;
    }

    // =========================================================
    // TODO 2: Invert Binary Tree (LC #226) — Easy
    // =========================================================
    // Problem : Given root of binary tree, invert it and return root.
    //           (Mirror the tree — swap left and right at every node)
    // Example : [4,2,7,1,3,6,9] → [4,7,2,9,6,3,1]
    // Pattern : Swap root.left and root.right, then recurse on both.
    public TreeNode invertTree(TreeNode root) {
        // TODO: implement
        return null;
    }

    // =========================================================
    // TODO 3: Diameter of Binary Tree (LC #543) — Easy
    // =========================================================
    // Problem : Given root of binary tree, return diameter (length of
    //           longest path between any two nodes, measured in edges).
    //           Path may or may not pass through root.
    // Example : [1,2,3,4,5] → 3   (path: 4→2→1→3 or 5→2→1→3)
    // Pattern : At each node: diameter through it = depth(left) + depth(right).
    //           Track global max with an instance variable.
    public int diameterOfBinaryTree(TreeNode root) {
        // TODO: implement
        return 0;
    }

    // =========================================================
    // TODO 4: Validate Binary Search Tree (LC #98) — Medium
    // =========================================================
    // Problem : Given root of binary tree, determine if it is a valid BST.
    //           (Every node: all left subtree < node.val < all right subtree)
    // Example : [2,1,3] → true     [5,1,4,null,null,3,6] → false
    // Pattern : Pass min/max bounds down the recursion.
    //           root.val must be in (min, max) range.
    //           Left subtree: max becomes root.val.
    //           Right subtree: min becomes root.val.
    public boolean isValidBST(TreeNode root) {
        // TODO: implement
        return false;
    }
}
