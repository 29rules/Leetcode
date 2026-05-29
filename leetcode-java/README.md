# LeetCode DSA Pattern Mastery — Java

Solving **75 problems** across **15 patterns** in Java.
Structured from the *DSA Pattern Mastery* guide.

---

## Progress

| # | Pattern | Solved | Total | Status |
|---|---------|--------|-------|--------|
| 01 | Two Pointers | 1 | 5 | 🟡 In Progress |
| 02 | Sliding Window | 1 | 5 | 🟡 In Progress |
| 03 | Fast & Slow Pointers | 1 | 5 | 🟡 In Progress |
| 04 | Prefix Sum | 1 | 5 | 🟡 In Progress |
| 05 | Binary Search | 1 | 5 | 🟡 In Progress |
| 06 | Hashing / Hash Map | 1 | 5 | 🟡 In Progress |
| 07 | Stack & Monotonic Stack | 1 | 5 | 🟡 In Progress |
| 08 | Linked List Reversal | 1 | 5 | 🟡 In Progress |
| 09 | Tree DFS | 1 | 5 | 🟡 In Progress |
| 10 | Tree BFS | 1 | 5 | 🟡 In Progress |
| 11 | Graph BFS / DFS | 1 | 5 | 🟡 In Progress |
| 12 | Backtracking | 1 | 5 | 🟡 In Progress |
| 13 | Heap / Priority Queue | 1 | 5 | 🟡 In Progress |
| 14 | Dynamic Programming | 1 | 5 | 🟡 In Progress |
| 15 | Greedy | 1 | 5 | 🟡 In Progress |
| | **Total** | **15** | **75** | |

---

## How This Repo is Structured

```
leetcode-java/
├── README.md                         ← this file (progress tracker)
├── utils/
│   ├── ListNode.java                 ← shared linked list node
│   └── TreeNode.java                 ← shared tree node
└── patterns/
    ├── p01_two_pointers/
    │   └── TwoPointers.java          ← solved example + 4 TODOs
    ├── p02_sliding_window/
    │   └── SlidingWindow.java
    ├── p03_fast_slow_pointers/
    │   └── FastSlowPointers.java
    ├── p04_prefix_sum/
    │   └── PrefixSum.java
    ├── p05_binary_search/
    │   └── BinarySearch.java
    ├── p06_hashing/
    │   └── Hashing.java
    ├── p07_stack/
    │   └── StackProblems.java
    ├── p08_linked_list_reversal/
    │   └── LinkedListReversal.java
    ├── p09_tree_dfs/
    │   └── TreeDFS.java
    ├── p10_tree_bfs/
    │   └── TreeBFS.java
    ├── p11_graph/
    │   └── GraphBFSDFS.java
    ├── p12_backtracking/
    │   └── Backtracking.java
    ├── p13_heap/
    │   └── HeapProblems.java
    ├── p14_dynamic_programming/
    │   └── DynamicProgramming.java
    └── p15_greedy/
        └── Greedy.java
```

---

## How to Use This Repo

Each `.java` file contains:
- **Pattern explanation** at the top (what it is, when to use, key insight)
- **One fully solved example** from the guide with approach and comments
- **4 practice problems as TODO stubs** with problem statement, examples, and hints

### Workflow for each problem:
1. Read the problem statement and examples in the TODO comment
2. Read the pattern explanation at the top of the file
3. Try to solve it yourself (aim for 30 min before looking at hints)
4. Replace `// TODO: implement` with your solution
5. Test on LeetCode — copy just the method body into the Solution class

### When you solve a problem:
Update this README — change `[SOLVED]` in the file and update the progress table above.

---

## All 75 Problems

### Pattern 1 — Two Pointers
| Problem | Difficulty | Status |
|---------|-----------|--------|
| Two Sum II – Input Array Is Sorted | Medium | ✅ Solved |
| Valid Palindrome | Easy | ⬜ Todo |
| 3Sum | Medium | ⬜ Todo |
| Container With Most Water | Medium | ⬜ Todo |
| Trapping Rain Water | Hard | ⬜ Todo |

### Pattern 2 — Sliding Window
| Problem | Difficulty | Status |
|---------|-----------|--------|
| Longest Substring Without Repeating Characters | Medium | ✅ Solved |
| Best Time to Buy and Sell Stock | Easy | ⬜ Todo |
| Longest Repeating Character Replacement | Medium | ⬜ Todo |
| Permutation in String | Medium | ⬜ Todo |
| Minimum Window Substring | Hard | ⬜ Todo |

### Pattern 3 — Fast & Slow Pointers
| Problem | Difficulty | Status |
|---------|-----------|--------|
| Linked List Cycle | Easy | ✅ Solved |
| Middle of the Linked List | Easy | ⬜ Todo |
| Happy Number | Easy | ⬜ Todo |
| Linked List Cycle II | Medium | ⬜ Todo |
| Find the Duplicate Number | Medium | ⬜ Todo |

### Pattern 4 — Prefix Sum
| Problem | Difficulty | Status |
|---------|-----------|--------|
| Subarray Sum Equals K | Medium | ✅ Solved |
| Running Sum of 1d Array | Easy | ⬜ Todo |
| Find Pivot Index | Easy | ⬜ Todo |
| Product of Array Except Self | Medium | ⬜ Todo |
| Contiguous Array | Medium | ⬜ Todo |

### Pattern 5 — Binary Search
| Problem | Difficulty | Status |
|---------|-----------|--------|
| Koko Eating Bananas | Medium | ✅ Solved |
| Binary Search | Easy | ⬜ Todo |
| Search in Rotated Sorted Array | Medium | ⬜ Todo |
| Find First and Last Position of Element | Medium | ⬜ Todo |
| Median of Two Sorted Arrays | Hard | ⬜ Todo |

### Pattern 6 — Hashing
| Problem | Difficulty | Status |
|---------|-----------|--------|
| Two Sum | Easy | ✅ Solved |
| Contains Duplicate | Easy | ⬜ Todo |
| Valid Anagram | Easy | ⬜ Todo |
| Group Anagrams | Medium | ⬜ Todo |
| Longest Consecutive Sequence | Medium | ⬜ Todo |

### Pattern 7 — Stack & Monotonic Stack
| Problem | Difficulty | Status |
|---------|-----------|--------|
| Daily Temperatures | Medium | ✅ Solved |
| Valid Parentheses | Easy | ⬜ Todo |
| Min Stack | Medium | ⬜ Todo |
| Evaluate Reverse Polish Notation | Medium | ⬜ Todo |
| Largest Rectangle in Histogram | Hard | ⬜ Todo |

### Pattern 8 — Linked List Reversal
| Problem | Difficulty | Status |
|---------|-----------|--------|
| Reverse Linked List | Easy | ✅ Solved |
| Palindrome Linked List | Easy | ⬜ Todo |
| Reverse Linked List II | Medium | ⬜ Todo |
| Swap Nodes in Pairs | Medium | ⬜ Todo |
| Reverse Nodes in k-Group | Hard | ⬜ Todo |

### Pattern 9 — Tree DFS
| Problem | Difficulty | Status |
|---------|-----------|--------|
| Maximum Depth of Binary Tree | Easy | ✅ Solved |
| Same Tree | Easy | ⬜ Todo |
| Invert Binary Tree | Easy | ⬜ Todo |
| Diameter of Binary Tree | Easy | ⬜ Todo |
| Validate Binary Search Tree | Medium | ⬜ Todo |

### Pattern 10 — Tree BFS
| Problem | Difficulty | Status |
|---------|-----------|--------|
| Binary Tree Level Order Traversal | Medium | ✅ Solved |
| Average of Levels in Binary Tree | Easy | ⬜ Todo |
| Minimum Depth of Binary Tree | Easy | ⬜ Todo |
| Binary Tree Right Side View | Medium | ⬜ Todo |
| Binary Tree Zigzag Level Order | Medium | ⬜ Todo |

### Pattern 11 — Graph BFS / DFS
| Problem | Difficulty | Status |
|---------|-----------|--------|
| Number of Islands | Medium | ✅ Solved |
| Flood Fill | Easy | ⬜ Todo |
| Max Area of Island | Medium | ⬜ Todo |
| Clone Graph | Medium | ⬜ Todo |
| Rotting Oranges | Medium | ⬜ Todo |

### Pattern 12 — Backtracking
| Problem | Difficulty | Status |
|---------|-----------|--------|
| Subsets | Medium | ✅ Solved |
| Permutations | Medium | ⬜ Todo |
| Combination Sum | Medium | ⬜ Todo |
| Word Search | Medium | ⬜ Todo |
| N-Queens | Hard | ⬜ Todo |

### Pattern 13 — Heap / Priority Queue
| Problem | Difficulty | Status |
|---------|-----------|--------|
| Kth Largest Element in an Array | Medium | ✅ Solved |
| Last Stone Weight | Easy | ⬜ Todo |
| K Closest Points to Origin | Medium | ⬜ Todo |
| Top K Frequent Elements | Medium | ⬜ Todo |
| Find Median from Data Stream | Hard | ⬜ Todo |

### Pattern 14 — Dynamic Programming
| Problem | Difficulty | Status |
|---------|-----------|--------|
| House Robber | Medium | ✅ Solved |
| Climbing Stairs | Easy | ⬜ Todo |
| Coin Change | Medium | ⬜ Todo |
| Longest Increasing Subsequence | Medium | ⬜ Todo |
| Longest Common Subsequence | Medium | ⬜ Todo |

### Pattern 15 — Greedy
| Problem | Difficulty | Status |
|---------|-----------|--------|
| Jump Game | Medium | ✅ Solved |
| Best Time to Buy and Sell Stock II | Medium | ⬜ Todo |
| Jump Game II | Medium | ⬜ Todo |
| Gas Station | Medium | ⬜ Todo |
| Non-overlapping Intervals | Medium | ⬜ Todo |

---

## Key Patterns Cheat Sheet

| Pattern | When to use | Time | Space |
|---------|-------------|------|-------|
| Two Pointers | Sorted array, pairs, palindrome | O(n) | O(1) |
| Sliding Window | Contiguous subarray, max/min | O(n) | O(k) |
| Fast & Slow | Cycle detection, midpoint | O(n) | O(1) |
| Prefix Sum | Range sums, subarray sum = k | O(n) | O(n) |
| Binary Search | Sorted/monotonic, search space | O(log n) | O(1) |
| Hashing | Lookup, frequency, complement | O(n) | O(n) |
| Stack | Brackets, next greater, histogram | O(n) | O(n) |
| Linked List Reversal | Reverse list/sublist, palindrome | O(n) | O(1) |
| Tree DFS | Depth, path, validate | O(n) | O(h) |
| Tree BFS | Level order, shortest, right view | O(n) | O(w) |
| Graph BFS/DFS | Islands, flood fill, shortest path | O(V+E) | O(V) |
| Backtracking | Permutations, subsets, word search | O(n!) | O(n) |
| Heap | Top K, running median, merge K | O(n log k) | O(k) |
| Dynamic Programming | Optimization, counting, subsequence | O(n²) | O(n) |
| Greedy | Intervals, jump game, scheduling | O(n log n) | O(1) |
