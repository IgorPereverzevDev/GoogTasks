
public class Casino {

    private static int numberOfRounds = 0;

    public static int solution(int N, int K) {
        var bet = 1;
        return rec(N, K, bet);
    }

    private static int rec(int N, int K, int bet) {
        if (N == 0 || N <= 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        ++numberOfRounds;
        if (K == 0 && bet != N) {
            return rec(N - 1, K, ++bet);
        } else {
            if ((bet & 1) == 1) {
                return rec(N / 2, K, bet >> 2);
            } else {
                return rec(N - 1, --K, ++bet);
            }
        }
    }


    public static void main(String[] args) {
        //var N = 4;
        //var K = 1;
        var N = 8;
        var K = 0;
        //var N = 10;
        //var K = 10;
        //var N = 18;
        //var K = 2;
        Casino.solution(N, K);
        System.out.println(numberOfRounds);


    }
}
