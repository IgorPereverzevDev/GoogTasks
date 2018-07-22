import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Graph {

    static int[] bfs(int n, int m, int[][] edges, int s) {
        boolean visited[] = new boolean[n];
        int[] result = new int[n - 1];

        LinkedList<Integer> queue = new LinkedList<Integer>();
        Arrays.fill(result, -1);

        visited[s-1] = true;
        visited[s] = true;

        queue.add(s);

        while (queue.size() != 0) {
            int v = queue.poll();
            for (int[] k : edges) {
                if (!visited[k[1]]) {
                    visited[k[1]] = true;
                    result[v-1] += 7;
                }
                queue.add(k[1]);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] edges = new int[m][2];
            for (int edges_i = 0; edges_i < m; edges_i++) {
                for (int edges_j = 0; edges_j < 2; edges_j++) {
                    edges[edges_i][edges_j] = in.nextInt();
                }
            }
            int s = in.nextInt();
            int[] result = bfs(n, m, edges, s);
            for (int i = 0; i < result.length; i++) {
                if (i != s - 1) {
                    if (result[i] == 0) System.out.print("-1 ");
                    else System.out.print(result[i] + " ");
                }
            }
            System.out.println("");


        }
        in.close();
    }
}
