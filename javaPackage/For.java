package JavaPackage;

public class For {
    public static double calculateInterestRate(double amount, double interestRate){
        return(amount * (interestRate/100));
    }
    //  method to check whether the number is prime or not
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i<=n/2; i++){
            // alternate formula i <= (long) Math.sqrt(n) -> better accuracy
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        double interestRate = calculateInterestRate(10000, 2);
        System.out.println("10000  at interest is: "+interestRate);
        for(int i=5; i<=5; i++){
            System.out.println("Loop " + i +" Hello!");
        }
        // Incrementing from 2 upto 8
        for(int i=2; i<=8;i++){
            System.out.println("10000  at " + i +"% interest is: "+ String.format("%.2f",calculateInterestRate(10000, i)));
        }
        System.out.println("******************************************************");
        // Decrementing from 8 and to 2
        for(int i=8; i>=2; i--){
            System.out.println("10000  at " + i +"% interest is: "+ String.format("%.2f",calculateInterestRate(10000, i)));
        }
        System.out.println("******************************************************");
        
        int count = 0;
        for(int i=10;i<50;i++){
            if(isPrime(i)){
                count++;
                System.out.println("The Number "+ i + " is a prime number.");
            }
            // and if it already found 3 numbers exit from the loop
            if(count == 3){
                System.out.println("Exiting from the for loop");
                break;
            }
        }
    }
}
