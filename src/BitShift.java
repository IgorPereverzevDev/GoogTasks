
public class BitShift {


   static int bit2(int x) {
        x |= x >> 1;
        x |= x >> 2;
        x |= x >> 4;
        x |= x >> 8;
        x |= x >> 16;
        return x - (x >> 1);
    }


    public static int updateBits(int n, int m, int i, int j) {
        int max = ~0; /* All 1’s */

        // 1’s through position j, then 0’s
        int left = max - ((1<<j) -1);

        // 1’s after position i
        int right = (1<<i) -1;

        // 1’s, with 0s between i and j
        int mask = left | right;

         // Clear i through j, then put m in there
         return (n & mask) | (m << i);
    }

    public static void main(String[] args) {
        System.out.println(bit2(21));
        System.out.println(updateBits(1024,21,2,6));
    }

}



