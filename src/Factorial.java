import java.math.BigInteger;


public class Factorial {
    static BigInteger factorialIter(int n) {
        BigInteger result = BigInteger.ONE;
        if(n < 0){
            throw new IllegalArgumentException();
        }
        for(int i =1; i<=n; ++i) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print(factorialIter(3));
    }
}
