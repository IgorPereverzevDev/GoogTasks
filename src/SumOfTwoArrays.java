import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfTwoArrays {
    static int[] solution(int[] a, int[] b) {
        return (a != null && b != null ? sum(a, b) : (a == null ? b : a));
    }

    static int[] sum(int[] a, int[] b) {
        int a1 = IntStream.range(0, a.length).reduce(0, (acc, x) -> acc + (int) Math.pow(10, x) * a[a.length - x - 1]);
        int b1 = IntStream.range(0, b.length).reduce(0, (acc, y) -> acc + (int) Math.pow(10, y) * b[b.length - y - 1]);
        return Integer.toString(a1 + b1).chars().map(c -> c -= '0').toArray();
    }
    
    public static void main(String[] args) {
        int[] a = {1, 5, 2};
        int[] b = {4, 2, 6, 7};
        System.out.print(Arrays.toString(solution(a, b)));
    }
}
