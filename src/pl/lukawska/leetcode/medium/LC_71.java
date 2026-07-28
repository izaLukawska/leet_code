package pl.lukawska.leetcode.medium;

import java.util.ArrayDeque;
import java.util.Deque;

//https://leetcode.com/problems/simplify-path/description/
public class LC_71 {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();

        for (String dir : path.split("/")) {
            if (dir.isEmpty() || dir.equals(".")) {
                continue;
            }

            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(dir);
            }
        }

        if (stack.isEmpty()) {
            return "/";
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.insert(0, "/" + stack.pop());
        }

        return sb.toString();
    }
}
