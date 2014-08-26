package com.leetcode.onlinejudge.problems._9_bfs;

import com.leetcode.interfaces.IProblem;
import com.leetcode.onlinejudge.BaseProblem;

/**
 * Created by Who on 2014/8/26.
 */
public class _102_Surrounded_Regions extends BaseProblem implements IProblem {
    @Override
    public String getSummary() {
        return "Given a 2D board containing 'X' and 'O', capture all regions surrounded by 'X'.\n" +
                "A region is captured by flipping all 'O's into 'X's in that surrounded region.\n" +
                "For example,\n" +
                "X X X X\n" +
                "X O O X\n" +
                "X X O X\n" +
                "X O X X\n" +
                "After running your function, the board should be:\n" +
                "X X X X\n" +
                "X X X X\n" +
                "X X X X\n" +
                "X O X X";
    }

    @Override
    public void run() {

    }
}