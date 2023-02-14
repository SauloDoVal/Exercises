public class ClockAngle {
    public static void main(String[] args) {
        int hour = 2;
        int minute = 15;

        double hourAngle = (hour % 12) * 30 + (minute / 60.0) * 30;
        double minuteAngle = minute * 6;

        double angle = Math.abs(hourAngle - minuteAngle);
        angle = Math.min(360 - angle, angle);

        System.out.println("Angle between hour and minute hand: " + angle + " degrees");
    }
}