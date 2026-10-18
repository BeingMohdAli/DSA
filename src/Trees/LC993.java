package Trees;

import jdk.jshell.execution.JdiExecutionControlProvider;

import java.util.ArrayDeque;

public class LC993 {
    static void main() {

    }

    public static boolean isCousins(TreeNode root, int x, int y) {

       TreeNode xx = findNode(root ,x);
       TreeNode yy = findNode(root , y);

       return (
               findDepth(root,xx,0)==findDepth(root,yy,0) && !isSibling(root,xx,yy)
               );


}
    static int findDepth(TreeNode root, TreeNode target, int d) {
        if (root == null) {
            return -1;               // not found
        }
        if (root == target) {        // or root.val == target.val
            return d;
        }
        int left = findDepth(root.left, target, d + 1);
        if (left != -1) {
            return left;
        }
        return findDepth(root.right, target, d + 1);
    }
    public static TreeNode findNode(TreeNode root, int target){
        if (root == null) return null;
        if (root.val == target) return root;
        TreeNode leftAns = findNode(root.left, target);
        if(leftAns!=null) return leftAns;
        return findNode(root.right,target);
    }
    public static boolean isSibling(TreeNode root, TreeNode x , TreeNode y){
        if (root == null) return false;
        if((root.left==x&&root.right==y)||root.left==y&&root.right==x)return true;
        boolean sibling = isSibling(root.left, x, y);
        if(sibling) return true;
        return isSibling(root.right,x,y);
    }

}
