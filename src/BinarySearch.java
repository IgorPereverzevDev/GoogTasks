import java.util.Arrays;

public class BinarySearch {
    static int[] searchInSortedArray(int[] array, int v) {
        int[] result = new int[2];
        int low = 1;
        int hi = array.length - 1;
        while (low < hi) {
            int mid = (low + hi) >>> 1;
            if (v > array[mid]) {
                low = mid + 1;
            } else if (v < array[mid]) {
                hi = mid;
            } else {
                //System.out.print("we found");
                low = hi + 1;
                result[0] = mid;
                result[1] = v;
                return result;
            }
        }
        return result;
    }

    static int[] searchInUnsortedArray(int arr[], int x) {
        var n = arr.length;
        var result = new int[2];
        // 1st comparison
        if (arr[n-1] == x) {
            result[0] = n-1;
            result [1] = x;
            return result;
        }
        var backup = arr[n-1];
        arr[n-1] = x;

        // no termination condition and thus
        // no comparison
        for (var i = 1; ;i++) {
            // this would be executed at-most n times
            // and therefore at-most n comparisons
            if (arr[i] == x) {
                // replace arr[n-1] with its actual element
                // as in original 'arr[]'
                arr[n-1] = backup;

                // if 'x' is found before the '(n-1)th'
                // index, then it is present in the array
                // final comparison
                if (i < n-1) {
                    result[0] = i;
                    result [1] = x;
                    return result;
                } else {
                    return result;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {27};
        int v = 5;
        System.out.println(Arrays.toString(searchInSortedArray(array, v)));
    }
}
