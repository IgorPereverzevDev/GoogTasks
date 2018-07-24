public class Anagramm {

    private static boolean anagram(String s, String t) {
        if (s.length() != t.length()) return false;
        var letters = new int[256];
        var num_unique_chars = 0;
        var num_completed_t = 0;
        var s_array = s.toCharArray();
        for (var c : s_array) { // count number of each char in s.
            if (letters[c] == 0) {
                ++num_unique_chars;
            }
            ++letters[c];
        }
        for (var i = 0; i < t.length(); ++i) {
            var c = (int) t.charAt(i);
            if (letters[c] == 0) { // Found more of char c in t than in s.
                return false;
            }
            --letters[c];
            if (letters[c] == 0) {
                ++num_completed_t;
                if (num_completed_t == num_unique_chars) {
                    // it’s a match if t has been processed completely
                    return i == t.length() - 1;
                }
            }
        }
        return false;
    }


    public static boolean isAnagram(String word, String anagram) {
        boolean isAnagram = false;
        if (word != null && anagram != null && word.length() == anagram.length()) {
            char[] arr = word.toCharArray();
            StringBuilder temp = new StringBuilder(anagram);
            int wordLength = word.length();
            for (char ch : arr) {
                int index = temp.indexOf("" + ch);
                if (index != -1) {
                    temp.deleteCharAt(index);
                }
            }
            isAnagram = temp.toString().isEmpty();
        }
        return isAnagram;
    }

    public static void main(String[] args) {
        var s = "bbbaaad";
        var b = "aaabbbc";
        Anagramm.isAnagram(s,b);
    }

}
