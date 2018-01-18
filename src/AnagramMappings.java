public class AnagramMappings {


    int[] anagramMappings(int[] A, int[] B) {
        int i = 0;
        int[] result = new int[A.length];
        for (int j = 0; j < B.length; ++j) {
            if (A[i] == B[j]) {
                result[i] = j;
                if(i == A.length-1){
                    break;
                }
            }
            if (j == B.length - 1 || result[i] != 0) {
                ++i;
                j = -1;
            }
        }
        return result;

    }


    public static void main(String[] args) {
        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};
        AnagramMappings anagramMappings = new AnagramMappings();
        anagramMappings.anagramMappings(A, B);
    }
}


