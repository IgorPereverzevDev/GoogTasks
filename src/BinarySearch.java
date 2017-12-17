


public class BinarySearch {
     static void solution(int[] array, int v) {
        int low = 0;
        int hi = array.length - 1;
        while (low <= hi) {
            int mid = (low + hi) / 2;
            if (v > mid) {
                low = mid + 1;
            } else if (v < mid) {
                hi = mid - 1;
            } else {
                System.out.print("we found");
                low = hi + 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {27,9,105, 3, 2, 5, 2, 1};
        int v = 5;
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sortArray(array);
        solution(array, v);
    }
}
