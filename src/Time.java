public class Time {

    static double getTimeAngle(int hours, int min) {
        double m1 = (double)min/60;
        double h = 360/12*(hours%12+ (double)min/60);
        int m = min*(360/60);
        return Math.abs(h-m);
    }

    public static void main(String[] args) {
        System.out.println(Time.getTimeAngle(3,15));
    }
}
