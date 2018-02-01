public class SortingDublicates {

    public static int[] solution(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < arr1.length || j < arr2.length) {
            if (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    stringBuilder.append(arr1[i]);
                    i += 1;
                } else if (arr2[i] < arr1[j]) {
                    stringBuilder.append(arr2[j]);
                    j += 1;
                } else if (arr1[i] == arr2[j]) {
                    stringBuilder.append(arr1[i]);
                    stringBuilder.append(arr2[j]);
                    i += 1;
                    j += 1;
                }
            } else if (i < arr1.length) {
                stringBuilder.append(arr1[i]);
                i += 1;
            } else if (j < arr2.length) {
                stringBuilder.append(arr2[j]);
                j += 1;
            }
        }
        String[] s = stringBuilder.toString().split(" ");
        for (i = 0; i < s.length; i++) {
            //parse and store each value into int[] to be returned
            result[i] = Integer.parseInt(s[i]);
        }
        return result;
    }
}