import java.util.Arrays;

public class OrganaizingContainers {

    static String organizingContainers(int[][] container) {
        int[] rowsum = new int[container.length];
        int[] colsum = new int[container.length];
        for (int i = 0; i < container.length; i++) {
            for (int j = 0; j < container[i].length; j++) {
                rowsum[i] += container[i][j];
                colsum[i] += container[j][i];
            }
        }
        Arrays.sort(rowsum);
        Arrays.sort(colsum);
        return Arrays.equals(rowsum, colsum) ? "Possible" : "Impossible";
    }

    public static void main(String[] args) {
        int a[][] = new int[][]{{1, 4}, {3, 1}};
        System.out.println(OrganaizingContainers.organizingContainers(a));
    }
}
