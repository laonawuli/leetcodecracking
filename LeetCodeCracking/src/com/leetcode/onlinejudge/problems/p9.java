package com.leetcode.onlinejudge.problems;

import com.leetcode.interfaces.IProblem;
import com.leetcode.onlinejudge.BaseProblem;

/**
 * Created by Who on 2014/6/27.
 */
public class p9 extends BaseProblem implements IProblem {
    @Override
    public String getName() {
        return "[UNSOLVED]Reorder List";
    }

    @Override
    public String getSummary() {
        return "Given a singly linked list L: L0→L1→…→Ln-1→Ln,\n" +
                "reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…\n" +
                "You must do this in-place without altering the nodes' values.\n" +
                "For example,\n" +
                "Given {1,2,3,4}, reorder it to {1,4,2,3}.";
    }

    @Override
    public void run() {

    }


    public class Solution {
        public void reorderList(ListNode head) {

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
