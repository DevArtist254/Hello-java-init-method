public class MethodOverloading {
    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500);
        System.out.println("New score " + newScore);

        calculateScore(75);
    }

    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points");

        return score * 1000;

    }
    public static int calculateScore(int score) {

        System.out.println(score + " points");

        return calculateScore("Anonymous", score);
    }

    public static int calculateScore() {

        System.out.println("No player  points");

        return 0;
    }
}

