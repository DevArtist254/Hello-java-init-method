public class loopExamples {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++){
            System.out.println(i + " is " + (isPrime(i) ? "" : "NOT") + " a prime number");
        }

        int sum = 0;
        int count = 0;

        for(int i = 1;i <= 1000; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                 sum += i;

                count++;
            }
            if(count == 5) break;
        }

        System.out.println(sum);
    }
    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for(int divisor = 2; divisor < wholeNumber; divisor++){
            if (wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
