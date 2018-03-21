import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {

    private static List<Integer> digits = new ArrayList<>();

    public static int solution (int a, int b) {
        if(a == 0 || b ==0 || b<10){
            return 0;
        }
        int count = 0;
        a = (a <= 10) ? 10 : a;
        for(int i = a; i<=b; ++i) {
            if(isPrime(i)) {
                ++count;
            }
        }
        return count;
    }

    private static boolean isPrime(int i) {
        int sum1 =0;
        int sum2 = 0;
        for(int j=i; j>0; j/=10){
            sum1 += j%10;
            sum2 += j%10 * j%10;
        }
        if(isPrimeOrNot(sum1) && isPrimeOrNot(sum2)) {
            digits.add(sum1);
            digits.add(sum2);
        }else {
            digits.clear();
            return false;
        }
        return digits.size() != 0;
    }

    private static boolean isPrimeOrNot(int n) {
        if (n == 2) return true;
        if (n%2==0) return false;
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[] ) throws Exception {
        System.out.print(solution(120,130));
    }
}
