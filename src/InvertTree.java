import java.util.LinkedList;
import java.util.Queue;

public class InvertTree {

    static class Node {
        Node left;
        Node right;
        int val;

        Node(int val) {
            this.val = val;
        }
    }

    Node getTraverse(Node node) {
        if (node == null) {
            return null;
        }
        return traverse(node);
    }

    private Node traverse(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        do {
            var current = queue.poll();
            var temp = current.left;
            current.left = current.right;
            current.right = temp;
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        } while (!queue.isEmpty());
        return node;
    }

    public static void main(String[] args) {
        var tree = new InvertTree();
        var root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(9);
        root.right.left = new Node(6);
        System.out.println(tree.getTraverse(root));
    }
}