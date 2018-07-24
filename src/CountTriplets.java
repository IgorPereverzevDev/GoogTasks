import java.util.HashMap;
import java.util.Map;

public class CountTriplets {

    static long countTriplets(long[] arr, long r) {
        long cnt = 0;
        Map<Long, Long> countNumber = new HashMap<>();
        Map<Long, Long> numberofpairs = new HashMap<>();
        for (long n : arr) {
            if (n % r == 0) {
                long pre = n / r;
                Long cnt2 = numberofpairs.get(pre);

                if (cnt2 != null) {
                    cnt += cnt2;
                }
                Long cnt1 = countNumber.get(pre);

                if (cnt1 != null)  {
                    numberofpairs.put(n, numberofpairs.getOrDefault(n, 0L) + cnt1);
                }
            }
            countNumber.put(n, countNumber.getOrDefault(n, 0L) + 1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        //long arr[] = {1,2,2,4};
        long arr[] = {1,3,9,9,27,81};
        int r = 3;
        CountTriplets.countTriplets(arr,r);
    }
}
