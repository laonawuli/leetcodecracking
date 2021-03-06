package com.leetcode.onlinejudge.problems._1_array;

import com.leetcode.interfaces.IProblem;
import com.leetcode.onlinejudge.BaseProblem;
import com.leetcode.onlinejudge.common.ListNode;
import com.leetcode.onlinejudge.problems.sketchbook.CC150_2_1;
import com.leetcode.onlinejudge.problems.sketchbook.CC150_2_4;

/**
 * Created by Xu on 9/13/14.
 */
public class _5_Median_of_Two_Sorted_Arrays extends BaseProblem implements IProblem {
    @Override
    public int getVersion() {
        return 2;
    }

    @Override
    public String getSummary() {
        return "There are two sorted arrays A and B of size m and n respectively. Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).";
    }

    @Override
    public void run() {
        char[] chars = "String".toCharArray();
        chars[2] = 0;
        print(String.valueOf(chars));

        new CC150_2_1().run();
        new CC150_2_4().run();
    }

    public class Solution {
        public double findMedianSortedArrays(int A[], int B[]) {
            return 0d;
        }
    }
}
