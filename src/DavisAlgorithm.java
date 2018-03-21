public class DavisAlgorithm {


 static int[][] mul(int[][] a) {
        int b[][] = {{1, 1, 0}, {1, 0, 1}, {1, 0, 0}};
        int c[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                for (int k = 0; k < 3; k++)
                    c[i][j] += a[i][k] * b[k][j];
        return c;
    }

    public static int s(int n) {
        int a[][] = {{1, 1, 0}, {1, 0, 1}, {1, 0, 0}};
        if (n == 1) return 1;
        else if (n == 2) return 2;
        else if (n == 3) return 4;
        else {
            for (int i = 0; i < n - 2; i++) {
                a = mul(a);
            }
            return 4 * a[0][2] + 2 * a[1][2] + a[2][2];
        }
    }


    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 3};

        //int [] arr = {1,4,5,3,2};
        int m = 4;
        System.out.println(s(7));
    }
}
