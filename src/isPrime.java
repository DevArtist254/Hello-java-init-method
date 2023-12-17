public class isPrime {
    public static void main(String[] args) {
        for(int num = 2;num <= 50; num++){
            System.out.println(num + " is "+(isPrimeNum(num) ? "" : "NOT" ) + " a prime number");
        }

        int sum = 0;
        int count = 0;

        for (int i =1;i <= 1000; i++){
            if(((i % 3) == 0) && ((i % 5) == 0)){
                System.out.println(i);
                sum += i;
                count ++;
            }
            if (count == 5) break;
        }

        System.out.println(sum);

    }

    public static boolean isPrimeNum(int num){
        if(num < 2){
            return (num == 2);
        }

        for(int divisor = 2; divisor < num; divisor++){
            if(num % divisor == 0){
                return false;
            }
        }

        return true;
    }
}
