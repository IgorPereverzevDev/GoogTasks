import java.util.HashMap;

public class SearchPairOfAmount {

    static int numPair(int[] a, int k) {
        if (k == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        var second = new int[2];
        for (var i = 0; i < a.length; ++i) {
            var first = k - a[i];
            if (first != 0) {
                second = BinarySearch.searchInUnsortedArray(a, first);
                if (second[1] != 0 && second[1] != k) {
                    map.put(a[i], second[1]);
                    a[i] = 0;
                    a[second[0]] = 0;
                }
            }
        }
        return map.size();
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 6, 46, 8, 58, 1, 46};
        var K = 14;

        System.out.println(SearchPairOfAmount.numPair(a, K));
    }
}
