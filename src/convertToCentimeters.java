public class convertToCentimeters {
    public static void main(String[] args) {
        double value = converterToCm(68);
        double value2 = converterToCm(5, 8);

        System.out.println("Yor sec is " + value2 + "cm");
        System.out.println("Your new value is " + value + "cm");
    }

    public static double converterToCm(int foot ,int inch) {
        double value1 = converterToCm(inch);
        double value2 = foot * 30.48;

        return value1 + value2;
    }

    public static double converterToCm(int inch) {
        return inch * 2.54;
    }

}
