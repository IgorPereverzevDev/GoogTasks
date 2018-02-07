
import java.util.*;


public class EvenTree {

    private static class Node<T> {
        private final List<Node<T>> childNodes = new ArrayList<>();

        private void addChildNode(Node<T> node) {
            this.childNodes.add(node);
        }
    }

    static  int[] evenTree(Node<Integer> node) {
        int count = 0, edgesToRemove = 0;
        for(Node<Integer> childNode : node.childNodes) {
            // For each child node
            // calls current method recursively
            final int[] tmpMetadata = evenTree(childNode);
            // Accumulates edgesToRemove in a local variable
            edgesToRemove += tmpMetadata[1];
            // Checks if returned count is even - if yes, increments edgesToRemove by 1
            // otherwise adds returned count to this method's count
            if(tmpMetadata[0] % 2 == 0) {
                edgesToRemove++;
            } else {
                count += tmpMetadata[0];
            }
        }
        // Increments count since we are done with current node processing
        count++;
        return new int[]{count, edgesToRemove};

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        final Node<Integer>[] treeNodes = (Node<Integer>[]) new Node[n];

        for(int i = 0; i < m; i++) {
            final int node1 = in.nextInt() - 1;
            final int node2 = in.nextInt() - 1;

            treeNodes[node1] = (treeNodes[node1] == null ? new Node<Integer>() : treeNodes[node1]);
            treeNodes[node2] = (treeNodes[node2] == null ? new Node<Integer>() : treeNodes[node2]);

            //In order to create edge, we need to link nodes. Since this is a tree, it will be a directed edge and
            // for consistency, we will add bigger node to smaller nodes
            if(node1 < node2) {
                treeNodes[node1].addChildNode(treeNodes[node2]);
            } else {
                treeNodes[node2].addChildNode(treeNodes[node1]);
            }
        }
        final int[] metadata = evenTree(treeNodes[0]);
        int result = metadata[1];
        System.out.println(result);
        in.close();
    }
}
