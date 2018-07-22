public class RecursiveDigitSum {

    static int superDigit(String n, int k) {
        if (n.length() == 1) {
            return n.charAt(0) - '0';
        }
        int res = 0;

        for (int i = 0; i < n.length(); i++) {
            res += n.charAt(i) - '0';
        }

        //res *= k;

        return superDigit(String.valueOf(res), 1);
    }


    public static void main(String[] args) {
        //var n = "123123123";
        var n = "23659788316494901364755750388777795758132267758518209123708121245026415389479208083977035497136784946";
        var k = 4;
        System.out.println(superDigit(n, k));
    }

}
