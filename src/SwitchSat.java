public class SwitchSat {
    public static void main(String[] args) {
        //Valid cases byte, short, int, char, String, enum
        //Fall through in switch statement when there is on break statement to tell it to stop
        //On fall thru
        int value = 3;

        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was 3, 4, 5");
            }
            default -> System.out.println("Was not 1 or 2");
        }
    }

    public static int checker(int val) {
        return switch (val) {
            case 1 -> 9;
            case 2 -> 8;
            case 3, 4, 5 -> 7;
            default -> 10;
        };
    }
}
