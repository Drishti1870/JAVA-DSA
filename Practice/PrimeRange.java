package Practice;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter lower");
        int lower= sc.nextInt();
        System.out.println("Enter upper");
        int upper= sc.nextInt();

        System.out.println("Prime number between" +lower + " and " +upper+ "  is :");
        // for finding prime number between the given limit
        for(int num=lower; num<=upper;num++){
            if(isPrime(num)){
                System.out.print(num + " ");
            }
        }

    }

     static boolean isPrime(int num) {
        if(num<2)
            return false;
        for(int i=2;i*i<=num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
