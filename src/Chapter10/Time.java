package Chapter10;

/**
 * Created by naatiqullahmohammed on 27/06/14.
 */
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        second = (int)totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        minute = (int)totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        hour = (int) (totalHours % 24);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public int getHour() {
        return hour;
    }

    public void setTime(long elapseTime) {
        long totalSeconds = elapseTime / 1000;
        second = (int)totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        minute = (int)totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        hour = (int) (totalHours % 24);
    }

    public String toString(){
        return hour +" : " + minute + " : " + second;
    }

    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        System.out.println(time1);
        System.out.println(time2);
    }

}
