
public class HammingDistance {

     static int solution(int x, int y) {
         int val = x^y;
         int count =0;

         while(val!=0){
             ++count;
             val &=val-1;

         }

         return count;
    }

    public static void main (String[] args) {
        System.out.print(solution(1,4));
    }
}
