package Trees;

import java.util.*;

public class LC103 {
    static void main() {

    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Deque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int level = 1;
        while (!q.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                if (level % 2 == 1) {
                    TreeNode curr = q.pollFirst();
                    l.add(curr.val);
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                } else {
                    TreeNode curr = q.pollLast();
                    l.add(curr.val);
                    if (curr.right != null) {
                        q.addFirst(curr.right);
                    }
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                }

            }
            level++;
            result.add(l);
        }
        return result;
        }

    }


