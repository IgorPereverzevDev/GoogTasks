public class PowerOfTwo {



  static int highestPowerof2(int n) {
        // Invalid input
        if (n < 1)
            return 0;

        int res = 1;

        // Try all powers starting from 2^1
        for (int i=0; i<8*Integer.SIZE; ++i){
            int curr = 1 << i;

            // If current power is more than n, break
            if (curr > n)
                break;

            res = curr;
        }

        return res;
    }

    // Driver code
    public static void main(String[] args) {
        int n = 19;
        System.out.println(highestPowerof2(n));
    }
}
