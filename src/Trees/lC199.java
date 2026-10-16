package Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class lC199 {
    static void main() {

    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        if(root==null) return l;
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if(i==size-1)l.add(curr.val);

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);

            }

        }
        return l;

    }
}