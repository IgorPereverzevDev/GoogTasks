
public class Converter {

    public static void binaryConverting(int n) {
        int i = bitsInNumber(n);
        int shift, bit;
        while (--i >= 0) {
            shift = (1 << i);
            bit = n & shift;
            if (bit == 0) {
                System.out.print(0);
            } else {
                System.out.print(1);
            }

        }
    }

    private static int bitsInNumber(int n) {
        int res = 0;
        while (n > 0) {
            n >>= 1;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        binaryConverting(120);

    }
}
