public class rateCal {
    public static void main(String[] args) {
        for (double rate = 2.5; rate <= 8.5; rate++){
            System.out.println("The rate for 10,000 ksh at " + rate +"% is " + calcRate(10000.00, rate) + "ksh");
        }


        for (double rate = 2.5; rate <= 8.5; rate+= 0.25){
            System.out.println("The rate for 1,000,000 ksh at " + rate +"% is " + calcRate(1000000.00, rate) + "ksh");
        }
    }

    public static double calcRate(double amount,double rate){
        return (amount * (rate / 100));
    }
}
