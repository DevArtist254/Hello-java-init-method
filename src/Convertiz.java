public class Convertiz {
    public static void main(String[] args) {
        int seconds = 45;
        int min = 0;
        int hrs = 0;
        int sec = 0;

        for(int i = seconds;60 < i; i -= 60){
            if(60 > i){
                sec = i;
            }else {
                sec = i - 60;
            }

            min++;

            if(min == 60){
                hrs++;
                min = 0;
            }
        }

        System.out.println(hrs);
        System.out.println(min);
        System.out.println(sec);
    }

}
