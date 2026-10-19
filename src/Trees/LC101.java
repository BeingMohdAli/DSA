package Trees;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayDeque;

public class LC101 {
    static void main() {

    }
    public static boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        return isMirror(root.left,root.right);
    }

    public static boolean isMirror(TreeNode a, TreeNode b) {
        if(a==null&&b==null) return true;
        if(a==null||b==null) return false;
        if(a.val!=b.val) return false;
        boolean mirror = isMirror(a.left, b.right);
        if(!mirror){
            return false;
        }
       return isMirror(a.right,b.left);

    }
}
