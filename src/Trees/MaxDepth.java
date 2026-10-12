
package Trees;
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

}

public class MaxDepth {
     static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution sol = new Solution();
        System.out.println("Maximum Depth: " + sol.maxDepth(root));
    }
}