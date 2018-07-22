import java.util.HashSet;
import java.util.Set;

public class DegreeOfNumber {

    public static int solution(int[] A) {
        int count2 = 0, count5 = 0;
        Set<Integer> indexes  = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            while (A[i] % 2 == 0) {
                A[i] = A[i] / 2;
                count2++;
            }
            while (A[i] % 5 == 0) {
                A[i] = A[i] / 5;
                count5++;
            }
        }
        return (count2 < count5) ? count2 : count5;
    }



    public static void main(String[] args) {
        int A[] = {7, 15, 6, 20, 5, 10}; // 15,20, 10,20, 5,20
        int B[] = {-1, -3};
        int C[] = {1, 2, 3};
        System.out.println(1e6);
        System.out.println(DegreeOfNumber.solution(A));
    }
}
