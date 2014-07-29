package com.leetcode.onlinejudge.problems._2_linkedlist;

import com.leetcode.interfaces.IProblem;
import com.leetcode.onlinejudge.BaseProblem;
import com.leetcode.onlinejudge.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Who on 2014/7/29.
 */
public class _25_Add_Two_Numbers extends BaseProblem implements IProblem {
    @Override
    public String getSummary() {
        return "You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.\n" +
                "Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)\n" +
                "Output: 7 -> 0 -> 8";
    }

    @Override
    public void run() {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(2);

        l2.next = l1;
        l3.next = l2;

        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(5);
        l5.next = l4;
        l6.next = l5;

        ListNode node = new Solution().addTwoNumbers(l3, l6);
    }

    public class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if (l1 == null && l2 == null) return null;
            List<Integer> resultList = new ArrayList<Integer>();
            getResult(resultList, l1, l2, 0);
            ListNode last = null;
            for (int i : resultList) {
                ListNode node = new ListNode(i);
                node.next = last;
                last = node;
            }
            return last;
        }

        private void getResult(List<Integer> resultList, ListNode l1, ListNode l2, int up) {
            if (l1 == null && l2 == null) {
                if (up != 0)
                    resultList.add(0, up);
            } else {
                int v1 = l1 == null ? 0 : l1.val;
                int v2 = l2 == null ? 0 : l2.val;
                l1 = l1 == null ? null : l1.next;
                l2 = l2 == null ? null : l2.next;
                int i = v1 + v2 + up;
                up = 0;
                if (i < 10) {
                    resultList.add(0, i);
                } else {
                    resultList.add(0, i - 10);
                    up = 1;
                }
                getResult(resultList, l1, l2, up);
            }
        }
    }
}
