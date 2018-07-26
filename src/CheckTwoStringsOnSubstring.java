public class CheckTwoStringsOnSubstring {

    public static boolean solution(String s1, String s2) {
        return (toInt(s1) & toInt(s2)) > 0;
    }

    private static int toInt(String str) {
        int res = 0;
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            a = str.charAt(i) - 'a';
            res |= 1 << a;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(CheckTwoStringsOnSubstring.solution("hi", "world"));
    }
}
