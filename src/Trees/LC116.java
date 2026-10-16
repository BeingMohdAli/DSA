package Trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class LC116 {
    static void main() {

    }


    public static TreeNode connect(TreeNode root) {
        if(root==null) return null;
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if(i< size-1) curr.next = q.peek();
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return root;
    }
}
