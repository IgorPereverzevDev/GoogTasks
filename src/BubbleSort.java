

class BubbleSort {
    int[] sortArray(int[] array) {
        if (array.length == 0) {
            System.out.print("array isEmpty ");
        }
        for (int i = array.length - 1; i > 0; --i) {
            for (int j = 0; j < array.length - 1; ++j) {
                if (array[j] > array[j + 1]) {
                    array[j] ^= array[j+1];
                    array[j+1] ^= array[j];
                    array[j] ^= array[j+1];
                }
            }
        }
        return array;
    }
}
