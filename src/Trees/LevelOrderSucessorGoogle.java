package Trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderSucessorGoogle {
    static void main() {

    }

    public static TreeNode levelOrderSuccessor(TreeNode root, TreeNode p){
        if(root==null){
            return null;
        }
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
            if(curr == p){
                return q.poll();
            }
        }
        return null;
    }
}
