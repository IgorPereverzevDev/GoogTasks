public class HourGlassum {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int total = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 2; ++i) {
            for (int j = 0; j < arr[0].length - 2; ++j) {
                int temp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (total < temp) {
                    total = temp;
                }

            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}};
        System.out.println(HourGlassum.hourglassSum(A));
    }
}
