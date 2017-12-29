import java.util.HashSet;


public class FindPairEqualityOfSumInArray {

    static boolean solution(final int[] array,  final int target) {
        HashSet comp = new HashSet();
        for(int value: array) {
            if (comp.contains(value) && comp.size()!=0) {
                return true;
            }
            comp.add(target -value);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1,5,4,2,7,4};
        System.out.println(solution(array, 8));
    }
}
