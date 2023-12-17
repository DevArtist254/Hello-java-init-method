public class enhancedSwi {
    public static void main(String[] args) {
        System.out.println("Good morning this " + dayOfTheWeek(10));
    }

    public static String dayOfTheWeek(int num) {
        return switch (num) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Error was out of range 1 - 7";
        };
    }
}
