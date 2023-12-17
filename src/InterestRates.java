public class InterestRates {
    public static void main(String[] args) {
        for(double rate = 2.5;rate <= 10.0; rate+=0.5){
            double amount = 100000.00;

            System.out.println("The rate for "+ amount +" ksh at "+ rate +"% is "+ rateCalculator(amount, rate) +" ksh");
        }
    }

    public static double rateCalculator(double amount,double rate){
        return (amount * (rate / 100));
    }
}
