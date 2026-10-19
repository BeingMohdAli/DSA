package Trees;

public class LC543 {
    static void main() {

    }

    public static int diameterOfBinaryTree(TreeNode root) {
        if (root==null) return 0;
        int leftDepth = 1+diameterOfBinaryTree(root.left);
        int rightDepth = 1+diameterOfBinaryTree(root.right);
        return -(rightDepth+leftDepth-2);

    }
}
