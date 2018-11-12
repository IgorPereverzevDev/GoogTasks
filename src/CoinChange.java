import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CoinChange {
    static List<Integer> minCoins(List<Integer> array, int changeAmount) {

        int n = array.size();
        int[] count = new int[changeAmount + 1];
        int[] from = new int[changeAmount + 1];

        count[0] = 1;
        for (int i = 0; i < changeAmount; i++)
            if (count[i] > 0)
                for (int j = 0; j < n; j++) {
                    int p = i + array.get(j);
                    if (p <= changeAmount) {
                        if (count[p] == 0 || count[p] > count[i] + 1) {
                            count[p] = count[i] + 1;
                            from[p] = j;
                        }
                    }
                }
        if (count[changeAmount] == 0)
            return null;
        int[] result = new int[count[changeAmount] - 1];
        int k = changeAmount;
        while (k > 0) {
            result[count[k] - 2] = array.get(from[k]);
            k = k - array.get(from[k]);
        }

        return Arrays.stream(result).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    }

    // Driver program
    public static void main(String[] args) {
        List<Integer> coins =new ArrayList<>();
        coins.add(20);
        coins.add(20);
        coins.add(10);
        coins.add(3);
        coins.add(1);
        int V = 33;
        System.out.println("Minimum coins required is "
                +minCoins(coins, V));
    }
}
