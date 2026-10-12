
package Trees;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int x = maxDepth(root.left);
        int y = maxDepth(root.right);

        return 1 + Math.max(x, y);
    }
    public void printLevelWise( ArrayList<TreeNode> list){
        if(list.isEmpty()){
            return;
        }
        TreeNode curr = list.removeFirst();
        System.out.print(curr.val+" ");

        if(curr.left!=null)list.addLast(curr.left);
        if(curr.right!=null) list.add(curr.right);


        printLevelWise(list);

    }
    public void printNotLevelWise(TreeNode root){
        if (root == null) {
            return ;
        }
        System.out.println(root.val);
        printNotLevelWise(root.left);
        printNotLevelWise(root.right);

    }


}

public class MaxDepth {
     static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

         ArrayList<TreeNode> l = new ArrayList<>();
         l.add(root);

        Solution sol = new Solution();
//        System.out.println("Maximum Depth: " + sol.maxDepth(root));
//         sol.printNotLevelWise(root);
         sol.printLevelWise(l);

    }
}