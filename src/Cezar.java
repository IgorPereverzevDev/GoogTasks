import java.util.HashSet;
import java.util.Set;

public class Cezar {

    public static int CeasarCypher(int[] input) {
        Set<Integer> set = new HashSet<>();
        int count = 1;
        int res = 0;
        for (int i = 0; i < input.length; ++i) {
            if (set.contains(input[i])) {
                ++count;
                if (count == 3) {
                    ++res;
                    count = 1;
                }
            }
            set.add(input[i]);
        }
        return res;
    }



    public static void main(String[] args) {
        String s = "Zwddg ogjdv!";
        int [] k =  {4, 3, 3, 3, 6, 1, 1, 1};
        System.out.println(Cezar.CeasarCypher(k));
    }
}
