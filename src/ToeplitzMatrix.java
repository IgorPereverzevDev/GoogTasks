import java.util.HashMap;
import java.util.Map;

public class ToeplitzMatrix {
    static boolean isToeplitzMatrix(int[][] matrix) {
        Map<Integer, Integer> groups = new HashMap<>();
        for (int r = 0; r < matrix.length; ++r) {
            for (int c = 0; c < matrix[0].length; ++c) {
                if (!groups.containsKey(r-c))
                    groups.put(r-c, matrix[r][c]);
                else if (groups.get(r-c) != matrix[r][c])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        //int[][] matrix = {{1, 2}, {2, 2,}};
        System.out.println(isToeplitzMatrix(matrix));
    }
}
