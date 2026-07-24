package pl.lukawska.leetcode.easy;

import pl.lukawska.leetcode.TreeNode;

//https://leetcode.com/problems/path-sum/description/
public class LC_112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
