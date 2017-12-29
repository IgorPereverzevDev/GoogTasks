
public class DiffBits {

    static int findComplement(int num) {
        int i = num;
        i |= (i >>  1);
        i |= (i >>  2);
        i |= (i >>  4);
        i |= (i >>  8);
        i |= (i >> 16);
        return num ^ ((i & ~(i >> 1)) << 1) - 1;
    }


    public static void main(String[] args) {
        System.out.println(findComplement(5));

    }
}
