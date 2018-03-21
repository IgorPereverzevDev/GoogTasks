public class LookAndSay {

    static void printSolution(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        int n = 5;
        LookAndSay.printSolution(findLookAndSayValue(n));
    }

    private static String findLookAndSayValue(int n) {

        if (n == 0 || n == 1)
            return n + "";

        String value = "1", tempValue;

        while (--n != 0) {
            tempValue = "";
            int count = 1;
            char[] array = value.toCharArray();
            char previous = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] != previous) {
                    tempValue = tempValue + count + previous;
                    previous = array[i];
                    count = 1;
                } else {
                    count++;
                }
            }
            value = tempValue + count + previous;
        }
        return value;
    }
}
