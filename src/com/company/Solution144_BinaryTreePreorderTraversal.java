package com.company;

import java.util.*;

public class Solution144_BinaryTreePreorderTraversal {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pre = new LinkedList<Integer>();
        if(root==null) return pre;
        Stack<TreeNode> tovisit = new Stack<TreeNode>();
        tovisit.push(root);
        while(!tovisit.empty()) {
            TreeNode visiting = tovisit.pop();
            pre.add(visiting.val);
            if(visiting.right!=null) tovisit.push(visiting.right);
            if(visiting.left!=null) tovisit.push(visiting.left);
        }
        return pre;

    }
}
