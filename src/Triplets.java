
import java.util.Arrays;
import java.util.HashSet;

public class Triplets {
    static boolean Solution(int [] array){
        HashSet <Integer> comp = new HashSet<>();
        int n = array.length;
        for (int i = 0; i<n-1; ++i) {
            for(int j = i+1; j < n-1; ++ j) {
                int value = - (array[i] + array[j]);
                if(comp.size() != 0 && comp.contains(value)) {
                    return true;
                }
                comp.add(value);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int array[] = {0,-1,2,-3,1};
        System.out.println(Solution(array));
    }
}
