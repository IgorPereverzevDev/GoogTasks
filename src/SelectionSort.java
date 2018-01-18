public class SelectionSort {

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; ++i) {
            int min = i;
            for (int j = i; j < array.length; ++j) {
                if (array[min] > array[j]) {
                    min = j;
                }

            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;


        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 8, 7, 9};
        SelectionSort.sort(arr);
    }
}
