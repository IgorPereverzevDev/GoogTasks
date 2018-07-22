import java.util.Arrays;
import java.util.stream.IntStream;

public class ClimbingLeaderboard {

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] array = IntStream.of(scores).distinct().toArray();
        int[] result = new int[alice.length];
        int i = array.length - 1;
        for (int j = 0; j <= alice.length; ++j) {
            while (i >= 0) {
                if (alice[j] >= array[i]) {
                    i--;
                } else {
                    result[j] = i + 2;
                    break;
                }
            }
            if (i < 0) {
                result[result.length-1]= 1;
                break;
            }
        }
        return result;
    }
    public static void main (String[]args){
        int[] A = {100, 100, 50, 40, 40, 20, 10};
        int[] B = {5, 25, 50, 120};
        System.out.println(Arrays.toString(ClimbingLeaderboard.climbingLeaderboard(A, B)));
    }
}
