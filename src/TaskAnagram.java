public class TaskAnagram {


    private static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        String lowS1 = s1.replaceAll("\\s", "").toLowerCase();
        String lowS2 = s2.replaceAll("\\s", "").toLowerCase();

        boolean status = true;
        char[] s1Array = lowS1.toCharArray();
        StringBuilder sb = new StringBuilder(lowS2);

        for (char c : s1Array) {
            int index = sb.indexOf("" + c);
            if (index != -1) {
                sb = sb.deleteCharAt(index);
            } else {
                status = false;
                break;
            }
        }
        return status;
    }


    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        System.out.println(TaskAnagram.isAnagram(s1, s2));
    }
}