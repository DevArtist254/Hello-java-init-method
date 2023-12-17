public class forLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }

        for(double rate = 2.0; rate <= 10.0; rate++ ){
            double interateCalc = calInt(100000, rate);

            System.out.println("The rate for 10,000.0 at " + rate + " is " + interateCalc  );
        }

        for(double rate = 7.5; rate <= 10.0; rate += 0.25){
            double interateCalc = calInt(1000, rate);

            System.out.println("The rate for 1000.0 at " + rate + " is " + interateCalc  );
        }

        for(double rate = 6.5; rate <= 10.0; rate += 0.25){
            double interateCalc = calInt(1000, rate);

            if (rate > 8.5) break;
            System.out.println("The rate for 1000.0 at " + rate + " is " + interateCalc  );
        }
    }

    public static double calInt(double amount, double intRate) {

        return (amount * (intRate / 100));
    }
}
