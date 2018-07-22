public class Fib {

    public static int soluion(int n) {
        if (n < 2) {
            return n;
        }
        int result = 0;
        int f1 = 0;
        int f2 = 1;
        for (int i = 1; i <= n; ++i) {
            result = f1 + f2;
            f2 = f1;
            f1 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Fib.soluion(5));
    }
}
