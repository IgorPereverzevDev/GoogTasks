import java.util.Arrays;

public class CheckTwoStringsOnSubstring {

    static int MAX_CHAR = 26;

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

    static boolean twoStrings(String s1, String s2)
    {
        // vector for storing character occurrences
        boolean v[]=new boolean[MAX_CHAR];
        Arrays.fill(v,false);

        // increment vector index for every
        // character of str1
        for (int i = 0; i < s1.length(); i++)
            v[s1.charAt(i) - 'a'] = true;

        // checking common substring of str2 in str1
        for (int i = 0; i < s2.length(); i++)
            if (v[s2.charAt(i) - 'a'])
                return true;

        return false;
    }


    public static void main(String[] args) {
        System.out.println(CheckTwoStringsOnSubstring.solution("hi", "world"));
    }
}
