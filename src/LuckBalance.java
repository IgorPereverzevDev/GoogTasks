import java.util.PriorityQueue;
import java.util.Queue;

public class LuckBalance {

    static int luckBalance(int k, int[][] contests) {
        Queue<Integer> heap = new PriorityQueue<>();
        int luck = 0;
        for(int i=0; i<contests.length; i++) {
            if(contests[i][1]!=1) luck+=contests[i][0];
            else if(heap.size()<k) heap.add(contests[i][0]);
            else if(k<1 || contests[i][0]<=heap.peek()) luck-=contests[i][0];
            else {luck-=heap.remove(); heap.add(contests[i][0]);}
        }
        luck += heap.stream().mapToInt(i->i).sum();
        return luck;
    }

    public static void main(String[] args) {
        int a[][] = {{5, 1}, {2, 1}, {1, 1}, {8, 1}, {10, 0}, {5, 0}};
        int k = 3;
        System.out.println(LuckBalance.luckBalance(k, a));
    }
}
