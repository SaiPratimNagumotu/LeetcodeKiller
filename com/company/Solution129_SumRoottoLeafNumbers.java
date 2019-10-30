package com.company;

import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.List;

public class Solution129_SumRoottoLeafNumbers {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public int sumNumbers(TreeNode root) {
        return sum(root,0);
    }
    public int sum(TreeNode root, int sum){
        if (root==null) return 0;
        if (root.left==null&&root.right==null) return sum*10+root.val;
        int left = sum(root.left,sum*10+root.val);
        int right = sum(root.right,sum*10+root.val);
        return left+right;
    }



}
