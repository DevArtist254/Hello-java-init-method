public class timeConverter {
    static int seconds = 3945;
    static int minutes = 0;
    static int hours = 0;

    public static void main(String[] args) {
        int hrs = convertHrs();
        int min = convertMin();

        if (hours != 0) {
            System.out.println(getDurationString(hrs, min, seconds));
        }

        if (hours == 0 && minutes != 0) {
            System.out.println(getDurationString(min, seconds));
        }

        if (minutes == 0 && hours == 0) {
            System.out.println(getDurationString(seconds));
        }


    }

    public static int convertMin() {
        if (seconds < 60) return minutes;
        seconds = seconds - 60;
        minutes ++;

        return convertMin();
    }

    public static int convertHrs() {
        if (seconds < 3600) return hours;
        seconds = seconds - 3600;
        hours ++;

        return convertHrs();
    }

    public static String getDurationString(int hrs, int min, int sec) {

        return hrs + "hrs " + min + "min " + sec +  "sec";
    }

    public static String getDurationString(int min, int sec) {

        return min + "min " + sec +  "sec";
    }

    public static String getDurationString(int sec) {

        return sec +  "sec";
    }
}
