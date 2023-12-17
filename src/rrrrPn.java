public class rrrrPn {
        public static void main(String[] args) {

            for(int i = 0;i <= 100;i++){
                System.out.println(i+" is " + (isPrime(i) ? "" : "NOT")+ " a prime number" );
            }
        }

        public static boolean isPrime(int wholeNumber) {
            if (wholeNumber < 2) {
                return (wholeNumber == 2);
            }

            for(int divisor = 2;divisor < wholeNumber; divisor++){
                if((wholeNumber % divisor) == 0){
                    return false;
                }
            }

            return true;
        }
}
