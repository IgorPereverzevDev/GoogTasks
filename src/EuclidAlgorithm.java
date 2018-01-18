

public class EuclidAlgorithm {

    int solution(int a, int b) {

        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }

        }
        return a+b;
    }

    public static void main(String[] args) {
        int a = 50;
        int b = 130;
        EuclidAlgorithm euclidAlgorithm = new EuclidAlgorithm();
        euclidAlgorithm.solution(a, b);
    }
}
