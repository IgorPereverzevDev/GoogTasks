import java.util.ArrayList;
import java.util.List;


public class SelfDividingNumber {

     List<Integer> getSelfDividingNumbers(int left, int right) {
        if (left == 0 && right == 0) {
            return null;
        }
        return selfDividingNumbers(left, right);
    }

    private List<Integer> selfDividingNumbers(int left, int right) {
        if (left == 0 && right == 0) {
            return null;
        }
        List<Integer> listResult = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (selfDividing(i)) {
                listResult.add(i);
            }
        }
        return listResult;
    }

    private static boolean selfDividing(int n) {
        int k = n;
        while (k > 0) {
            int m = k % 10;
            k /= 10;
            if (m == 0 || (n % m) > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print(new SelfDividingNumber().getSelfDividingNumbers(1, 22));
    }
}
