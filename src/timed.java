public class timed {
    static int seconds = 31965;
    static int hours = 0;
    static int minutes = 0;
    public static void main(String[] args) {
        int hrs = convertHours();
        int min = convertMinutes();

        if(hours != 0) {
            System.out.println(getDurationString(hrs, min, seconds));
        }

        if(hours == 0 && minutes != 0) {
            System.out.println(getDurationString(min, seconds));
        }

        if(hours != 0 && minutes != 0) {
            System.out.println(getDurationString(seconds));
        }
    }

    public static int convertMinutes() {
        if (seconds < 60) return  minutes;
        seconds = seconds - 60;
        minutes++;

        return convertMinutes();
    }

    public static int convertHours() {
        if (seconds < 3600) return hours;
        seconds = seconds - 3600;
        hours++;

        return convertHours();
    }

    public static String getDurationString(int hr, int min, int sec) {

        return hr + "hrs " + min + "min " + sec + "sec ";
    }

    public static String getDurationString( int min, int sec) {

        return min + "min " + sec + "sec ";
    }

    public static String getDurationString(int sec) {

        return sec + "sec ";
    }
}
