package Trees;

import java.util.*;

public class LC107 {

    static void main() {


    }

    public static List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (!q.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            int s = q.size();
            for (int i = 0; i < s; i++) {
                TreeNode curr = q.poll();
                l.add(curr.val);
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            result.add(l);

        }
         Collections.reverse(result);
            return result;
    }
}
