public class Time {

    static double getTimeAngle(int hours, int min) {
        return Math.abs(360/12*((hours%12)+ min/60)  - min*(360/60));
    }

    public static void main(String[] args) {
        System.out.println(Time.getTimeAngle(3,27));
    }
}
