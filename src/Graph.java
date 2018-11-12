import java.util.LinkedList;
import java.util.List;

public class Graph {

    static int findShortest(int graphNodes, int[][] adjacency_matrix, long[] ids, int val) {

        List queue = new LinkedList<Integer>();

        int result = 0;
        int[] visited = new int[graphNodes + 1];
        int i, element;

        visited[val] = 1;
        queue.add(val);

        while (!queue.isEmpty()) {
            element = 0;//queue.remove();
            i = element;
            while (i <= graphNodes) {
                if (adjacency_matrix[element][i] == 1 && visited[i] == 0) {
                    queue.add(i);
                    visited[i] = 1;
                }
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int graphNodes = 4;
        int graphEdges = 3;

        int[] graphFrom = {1, 1, 4};
        int[] graphTo = {2, 3, 2};
        long[] ids = {1, 2, 1, 1};
        int val = 1;

        int adjacency_matrix[][] = new int[graphNodes + 1][graphNodes + 1];

        for (int i = 0; i < graphEdges; ++i) {
            adjacency_matrix[i][i] = graphFrom[i];
            for (int j = 0; j < graphEdges; ++j) {
                adjacency_matrix[i][j] = graphTo[j];
            }
        }

        System.out.println(findShortest(graphNodes, adjacency_matrix, ids, val));

    }
}
