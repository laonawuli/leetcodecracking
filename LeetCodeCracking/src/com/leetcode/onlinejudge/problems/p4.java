package com.leetcode.onlinejudge.problems;

import com.leetcode.interfaces.IProblem;
import com.leetcode.onlinejudge.BaseProblem;

/**
 * Created by Who on 2014/6/25.
 */
public class p4 extends BaseProblem implements IProblem {
    @Override
    public String getName() {
        return "[UNSOLVED]Sort List";
    }

    @Override
    public String getSummary() {
        return "Sort a linked list in O(n log n) time using constant space complexity.";
    }

    @Override
    public void run() {

    }

    public class Solution {
        public ListNode sortList(ListNode head) {
            if (head == null) {
                return null;
            } else if (head.next == null) {
                return head;
            } else {
                while (head.next != null) {

                }
            }
            return null;
        }
    }

    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }
}