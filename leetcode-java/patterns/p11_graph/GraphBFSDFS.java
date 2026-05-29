package patterns.p11_graph;

import java.util.*;

/**
 * ============================================================
 * PATTERN 11: GRAPH BFS / DFS
 * ============================================================
 * WHAT IT IS:
 *   BFS uses a Queue to explore level-by-level (shortest path).
 *   DFS uses recursion/Stack to explore as deep as possible first.
 *   Both require a "visited" set to avoid revisiting nodes.
 *   Grids (2D arrays) are implicit graphs — cells are nodes, edges are neighbors.
 *
 * WHEN TO USE:
 *   - Connected components in a graph or grid
 *   - Flood fill / island counting
 *   - Shortest path in unweighted graph (BFS)
 *   - Cycle detection, topological sort (DFS)
 *   - Rotting oranges / multi-source BFS
 *
 * KEY INSIGHT:
 *   VISITED SET is critical — without it you'll loop forever.
 *   For grids: 4 directions = up/down/left/right.
 *   Multi-source BFS: add ALL starting nodes to queue first, then BFS.
 *
 * TIME:  O(V + E)  |  SPACE: O(V) for visited set
 * ============================================================
 *
 * PROBLEMS:
 *   [SOLVED]  Number of Islands    (LC #200) — Medium
 *   [ TODO ]  Flood Fill           (LC #733) — Easy
 *   [ TODO ]  Max Area of Island   (LC #695) — Medium
 *   [ TODO ]  Clone Graph          (LC #133) — Medium
 *   [ TODO ]  Rotting Oranges      (LC #994) — Medium
 */
public class GraphBFSDFS {

    // =========================================================
    // SOLVED EXAMPLE: Number of Islands (LC #200) — Medium
    // =========================================================
    // Problem : Given 2D grid of '1's (land) and '0's (water),
    //           return the number of islands. An island is surrounded
    //           by water and formed by connecting adjacent land ('1's).
    // Approach: DFS. For each '1' found, DFS to mark all connected
    //           '1's as visited (convert to '0'). Each DFS = 1 island.
    // Time: O(m*n)  Space: O(m*n) stack
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == '1') {
                    dfs(grid, r, c);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != '1') return;
        grid[r][c] = '0'; // mark visited
        dfs(grid, r+1, c);
        dfs(grid, r-1, c);
        dfs(grid, r, c+1);
        dfs(grid, r, c-1);
    }

    // =========================================================
    // TODO 1: Flood Fill (LC #733) — Easy
    // =========================================================
    // Problem : Given image (2D int array), starting pixel (sr, sc),
    //           and a color, flood-fill starting pixel and all
    //           connected pixels of the same original color.
    // Example : image=[[1,1,1],[1,1,0],[1,0,1]], sr=1,sc=1,color=2
    //           → [[2,2,2],[2,2,0],[2,0,1]]
    // Pattern : DFS/BFS from (sr,sc). Only fill cells that match
    //           original color. Don't revisit (check new color).
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // TODO: implement
        return image;
    }

    // =========================================================
    // TODO 2: Max Area of Island (LC #695) — Medium
    // =========================================================
    // Problem : Given binary grid (0=water, 1=land), return the
    //           maximum area of an island (connected 1s).
    //           Area = number of cells in island.
    // Example : (grid with islands) → 6
    // Pattern : DFS like Number of Islands, but DFS returns
    //           the count of cells in each island. Track max.
    public int maxAreaOfIsland(int[][] grid) {
        // TODO: implement
        return 0;
    }

    // =========================================================
    // TODO 3: Clone Graph (LC #133) — Medium
    // =========================================================
    // Problem : Given reference to a node in a connected undirected graph,
    //           return a deep copy of the graph.
    // Pattern : BFS or DFS + HashMap<original, clone>.
    //           For each node, create clone if not exists,
    //           then clone all neighbors.
    static class Node {
        int val;
        List<Node> neighbors;
        Node(int v) { val = v; neighbors = new ArrayList<>(); }
    }

    public Node cloneGraph(Node node) {
        // TODO: implement
        return null;
    }

    // =========================================================
    // TODO 4: Rotting Oranges (LC #994) — Medium
    // =========================================================
    // Problem : Grid: 0=empty, 1=fresh orange, 2=rotten orange.
    //           Each minute, rotten oranges spread to adjacent fresh ones.
    //           Return minimum minutes until no fresh oranges remain.
    //           Return -1 if impossible.
    // Example : [[2,1,1],[1,1,0],[0,1,1]] → 4
    // Pattern : Multi-source BFS. Add ALL rotten oranges to queue first.
    //           BFS level by level = one minute per level.
    public int orangesRotting(int[][] grid) {
        // TODO: implement
        return 0;
    }
}
