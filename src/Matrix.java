
public class Matrix {
    public static int[][] solution(int N,int[][] a) {
        if (a == null) {
            return null;
        }
        for (int x = 0; x < N/2; ++x) {
            for (int y = x; y < N-x-1; ++y) {
                int temp = a[x][y];

                a[x][y] = a[y][N-1-x];

                a[y][N-1-x] = a[N-1-x][N-1-y];

                a[N-1-x][N-1-y] = a[N-1-y][x];

                a[N-1-y][x] = temp;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int N =4;
        //4  8 12 16
        //3  7 11 15
        //2  6 10 14
        // 1  5  9 13
        displayMatrix(solution(N,array));
    }

    // Function to print the matrix
    static void displayMatrix(int mat[][]) {
        for (int[] aMat : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(" " + aMat[j]);
            }
            System.out.println();
        }
    }

}
