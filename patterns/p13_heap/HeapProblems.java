package patterns.p13_heap;

import java.util.*;

/**
 * ============================================================
 * PATTERN 13: HEAP / PRIORITY QUEUE
 * ============================================================
 * WHAT IT IS:
 *   A heap always gives you the min (min-heap) or max (max-heap) in O(log n).
 *   Java's PriorityQueue is a min-heap by default.
 *   For max-heap: PriorityQueue<>(Collections.reverseOrder())
 *
 * WHEN TO USE:
 *   - Finding Kth largest/smallest element
 *   - Top K frequent elements
 *   - K closest points
 *   - Merging K sorted lists
 *   - Running median (two heaps)
 *   - Any problem needing efficient min/max updates
 *
 * KEY INSIGHT:
 *   "Top K largest" → min-heap of size K (kick out smallest, keep K largest).
 *   "Top K smallest" → max-heap of size K (kick out largest, keep K smallest).
 *   Running median → max-heap for left half, min-heap for right half.
 *
 * TIME:  O(n log k)  |  SPACE: O(k)
 * ============================================================
 *
 * PROBLEMS:
 *   [SOLVED]  Kth Largest Element in an Array  (LC #215) — Medium
 *   [ TODO ]  Last Stone Weight                 (LC #1046)— Easy
 *   [ TODO ]  K Closest Points to Origin        (LC #973) — Medium
 *   [ TODO ]  Top K Frequent Elements           (LC #347) — Medium
 *   [ TODO ]  Find Median from Data Stream      (LC #295) — Hard
 */
public class HeapProblems {

    // =========================================================
    // SOLVED EXAMPLE: Kth Largest Element in an Array (LC #215)
    // =========================================================
    // Problem : Given integer array and k, return the kth largest element.
    // Approach: Min-heap of size k.
    //           For each number: add to heap.
    //           If size > k: poll (remove smallest).
    //           After all numbers: heap.peek() = kth largest.
    // Time: O(n log k)  Space: O(k)
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) minHeap.poll(); // remove smallest
        }
        return minHeap.peek(); // kth largest remains
    }

    // =========================================================
    // TODO 1: Last Stone Weight (LC #1046) — Easy
    // =========================================================
    // Problem : Each turn, smash the two heaviest stones.
    //           If equal: both destroyed. If not: heavier - lighter remains.
    //           Return weight of last stone (0 if none left).
    // Example : [2,7,4,1,8,1] → 1
    // Pattern : Max-heap. Repeatedly extract top two, apply rule, re-insert.
    public int lastStoneWeight(int[] stones) {
        // TODO: implement
        return 0;
    }

    // =========================================================
    // TODO 2: K Closest Points to Origin (LC #973) — Medium
    // =========================================================
    // Problem : Given array of points and k, return the k closest
    //           points to the origin (0,0). Distance = Euclidean.
    // Example : [[1,3],[-2,2]], k=1 → [[-2,2]]
    // Pattern : Max-heap of size k by distance.
    //           Keep kicking out the farthest → k closest remain.
    //           (Don't need sqrt — compare x²+y² directly)
    public int[][] kClosest(int[][] points, int k) {
        // TODO: implement
        return new int[][]{};
    }

    // =========================================================
    // TODO 3: Top K Frequent Elements (LC #347) — Medium
    // =========================================================
    // Problem : Given integer array, return k most frequent elements.
    //           Answer is guaranteed to be unique.
    // Example : [1,1,1,2,2,3], k=2 → [1,2]
    // Pattern : HashMap for frequencies. Then min-heap of size k
    //           (keyed by frequency) → keeps k most frequent.
    //           Alternative: bucket sort by frequency.
    public int[] topKFrequent(int[] nums, int k) {
        // TODO: implement
        return new int[]{};
    }

    // =========================================================
    // TODO 4: Find Median from Data Stream (LC #295) — Hard
    // =========================================================
    // Problem : Design a data structure that supports:
    //           addNum(int num) — adds number from data stream
    //           findMedian()   — returns median of all numbers so far
    // Pattern : Two heaps:
    //           maxHeap (left half) + minHeap (right half).
    //           Keep sizes balanced (maxHeap can have 1 extra).
    //           Median = maxHeap.peek() or average of both tops.
    static class MedianFinder {
        // TODO: implement fields (two PriorityQueues)

        public MedianFinder() {
            // TODO
        }

        public void addNum(int num) {
            // TODO
        }

        public double findMedian() {
            // TODO
            return 0.0;
        }
    }
}
