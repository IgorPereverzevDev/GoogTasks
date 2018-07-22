public class HeightTree {

    class Node {
        private Node left, right;
        private int v;

    }

    public static int solution(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(solution(node.left), solution(node.right));
    }

}
