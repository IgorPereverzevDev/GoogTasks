import java.util.HashMap;

public class CounterSymbols {
    static String solution(String s) {
        if (s.isEmpty()) {
            return null;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 1);
        final StringBuilder builder = new StringBuilder();
        int length = s.length() - 1;
        for (int i = 1; i <= length; ++i) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (Object key : map.keySet()) {
            builder.append(key);
            builder.append(map.get(key));
        }
        return builder.toString();
    }


    public static void main(String[] args) {
        String s = "aaabbccb";
        System.out.println(solution(s));
    }
}
