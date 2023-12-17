public class loopConverter {
    static int seconds = 3965;
    static int minutes = 0;
    static int hours = 0;

    public static void main(String[] args) {
        convertMin();
    }

    public static int convertMin(){
        if(seconds > 59){
            for(int i = 0;seconds <= 60;i -= 60){
             System.out.println(i);
            }
        }

        return minutes;
    }

    public static int convertHours(){

        return hours;
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
