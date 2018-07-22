import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortestSubArrayAtLeastK {

    public static int solution(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return shoppingOffers(price, special, special.size() - 1, needs);
    }

    private static int shoppingOffers(List<Integer> price, List<List<Integer>> special, int i, List<Integer> needs) {
        if (i < 0) {
            // no special to select
            int ans = 0;
            for (int j = 0; j < needs.size(); j++) {
                ans += needs.get(j) * price.get(j);
            }
            return ans;
        } else {
            // if i-th special can take into consideration
            if (isTrue(needs, special.get(i))) {
                List<Integer> sub = new ArrayList<>(needs);
                for (int j = 0; j < sub.size(); j++) {
                    sub.set(j, sub.get(j) - special.get(i).get(j));
                }
                return Math.min(special.get(i).get(sub.size()) + shoppingOffers(price, special, i, sub), shoppingOffers(price, special, i - 1, needs));
            } else {
                return shoppingOffers(price, special, i - 1, needs);
            }
        }
    }

    private static boolean isTrue(List<Integer> needs, List<Integer> cmp) {
        for (int i = 0; i < needs.size(); i++) {
            if (needs.get(i) < cmp.get(i)) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        List<Integer> one = new ArrayList<>();
        one.add(2);
        one.add(5);

        List<List<Integer>> two = new ArrayList<>();
        two.add(new ArrayList<>(Arrays.asList(3, 0, 5)));
        two.add(new ArrayList<>(Arrays.asList(1, 2, 10)));

        List<Integer> three = new ArrayList<>();
        three.add(3);
        three.add(2);

        ShortestSubArrayAtLeastK.solution(one, two, three);
    }
}