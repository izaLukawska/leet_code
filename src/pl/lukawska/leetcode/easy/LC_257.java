package pl.lukawska.leetcode.easy;

import pl.lukawska.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LC_257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        dfs(root, paths, "");
        return paths;
    }

    private void dfs(TreeNode treeNode, List<String> paths, String path) {
        if (treeNode == null) {
            return;
        }

        if (path.isEmpty()) {
            path = String.valueOf(treeNode.val);
        } else {
            path = path + "->" + treeNode.val;
        }

        if (treeNode.left == null && treeNode.right == null) {
            paths.add(path);
            return;
        }

        dfs(treeNode.left, paths, path);
        dfs(treeNode.right, paths, path);
    }
}
