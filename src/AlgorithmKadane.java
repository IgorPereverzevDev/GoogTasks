public class AlgorithmKadane {


    public static int solution(int[] array) {
        int ans = array[0],
                ans_l = 0,
                ans_r = 0,
                sum = 0,
                minus_pos = -1;
        for (int r = 0; r < array.length; ++r) {
            sum += array[r];

            if (sum > ans) {
                ans = sum;
                ans_l = minus_pos + 1;
                ans_r = r;
            }

            if (sum < 0) {
                sum = 0;
                minus_pos = r;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 8, 9};
        System.out.println(solution(a));

    }
}
