import java.util.ArrayList;
import java.util.List;

public class Combinations {

    static int combinationUtil(int arr[]) {

        List<int[]> subsets = new ArrayList<>();

        int k = arr.length;
        int[] s = new int[k];                  // here we'll keep indices
        // pointing to elements in input array
        // first index sequence: 0, 1, 2, ...
        for (int i = 0; (s[i] = i) < k - 1; i++) ;
        subsets.add(getSubset(arr, s));
        for (; ; ) {
            int i;
            // find position of item that can be incremented
            for (i = k - 1; i >= 0 && s[i] == arr.length - k + i; i--) ;
            if (i < 0) {
                break;
            }
            s[i]++;                    // increment this item
            for (++i; i < k; i++) {    // fill up remaining items
                s[i] = s[i - 1] + 1;
            }
            subsets.add(getSubset(arr, s));
        }
        return subsets.size();
    }

    // generate actual subset by index sequence
    static int[] getSubset(int[] input, int[] subset) {
        int[] result = new int[subset.length];
        for (int i = 0; i < subset.length; i++)
            result[i] = input[subset[i]];
        return result;

    }


    /*Driver function to check for above function*/
    public static void main(String[] args) {
        int arr[] = {1, 2, 1,1};
        combinationUtil(arr);
    }
}