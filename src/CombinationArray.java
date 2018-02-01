import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class CombinationArray {

    private TreeSet hs = new TreeSet();

    TreeSet permutation(String prefix, String str) {

        int n = str.length();
        hs.add(prefix);
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        return hs;

    }

    void print(TreeSet hs) {
        for (Object h : hs) {
            String str = (String) h;
            System.out.println(str);
        }
    }


    public static void main(String[] args) {
        CombinationArray b = new CombinationArray();
        String ss = "abc";
        TreeSet hss = b.permutation("", ss);
        b.print(hss);
        int i;
        ArrayList al = new ArrayList();
        for (i = 1; i <= ss.length(); i++) {
            for (Object hs1 : hss) {
                String str = (String) hs1;
                if (str.length() == i) {
                    al.add(str);
                }
            }
        }

        for (i = 0; i < al.size(); i++) {
            System.out.println((String) al.get(i));
        }
    }
}
