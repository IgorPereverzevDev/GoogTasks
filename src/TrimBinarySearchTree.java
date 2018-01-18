public class TrimBinarySearchTree {

     TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) return root;
        if (root.val > R) return trimBST(root.left, L, R);
        if (root.val < L) return trimBST(root.right, L, R);

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }

    public static void main(String[] args) {
        TrimBinarySearchTree trimBinarySearchTree = new TrimBinarySearchTree();
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(0);
        treeNode.right = new TreeNode(2);
        trimBinarySearchTree.trimBST(treeNode,1,2);
    }


     static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
