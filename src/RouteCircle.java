
public class RouteCircle {

    static boolean judgeCircle(String moves) {
        if (moves.isEmpty()) {
            return false;
        }
        char[] symMov = moves.toCharArray();
        int x = 0;
        int y = 0;
        for (char aSymMov : symMov) {
            switch (aSymMov) {
                case 'U':
                    ++y;
                    break;
                case 'D':
                    --y;
                    break;
                case 'R':
                    ++x;
                    break;
                default:
                    --x;
            }
        }
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("RLUURDDDLU"));
    }
}
