
package Trees;

import com.sun.source.tree.Tree;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.Queue;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode next;

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
    public void printLevelWiseUsingLoop( ArrayList<TreeNode> list){
      while(!list.isEmpty()){
          TreeNode curr = list.removeFirst();
          System.out.print(curr.val+" ");

          if(curr.left!=null)list.addLast(curr.left);
          if(curr.right!=null) list.add(curr.right);
      }

    }
    public void printLevelWiseUsingFullOptimise(Queue<TreeNode> q){
        if(q.isEmpty()){
            return;
        }
        TreeNode curr = q.poll();
        System.out.print(curr.val+" ");
        if(curr.left!=null)q.add(curr.left);
        if(curr.right!=null)q.add(curr.right);
        printLevelWiseUsingFullOptimise(q);

    }

    public void printNotLevelWise(TreeNode root){
        if (root == null) {
            return ;
        }
        System.out.println(root.val);
        printNotLevelWise(root.left);
        printNotLevelWise(root.right);

    }
    public boolean findNode(TreeNode root,TreeNode target){
        if (root == null) return false;
        if (root == target) return true;

        boolean leftAns = findNode(root.left, target);
        if(leftAns) return leftAns;
        return findNode(root.right,target);
    }

    public boolean isSibling(TreeNode root, TreeNode x , TreeNode y){
        if (root == null) return false;
        if((root.left==x&&root.right==y)||root.left==y&&root.right==x)return true;
        boolean sibling = isSibling(root.left, x, y);
        if(sibling) return true;
        return isSibling(root.right,x,y);
    }


}

public class MaxDepth {
     static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

//         ArrayList<TreeNode> l = new ArrayList<>();
//         l.add(root);
//Queue<TreeNode> q = new LinkedList<>();
//q.add(root);
     Solution sol = new Solution();
////        System.out.println("Maximum Depth: " + sol.maxDepth(root));
////         sol.printNotLevelWise(root);
////         sol.printLevelWise(l);
//         sol.printLevelWiseUsingFullOptimise(q);

         System.out.println(sol.isSibling(root ,root.left.left,root.left.right));
    }
}