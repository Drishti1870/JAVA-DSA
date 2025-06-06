package Recursion;

public class Digitaum {
    //sum of digit
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+ sum(n/10);
    }
    static int product(int n){
        if(n%2==n){
            return n;
        }
        return (n%10)* product(n/10);
    }

    //reverse of number
    static int sum=0;
    static void reverse(int n){
         if(n==0){
            return;
         }
         int rem=n%10;
         sum=sum*10+rem;
         reverse(n/10);
    }

    //count zeros
    static int count(int n){
        return helper(n,0);
    }
    static int helper(int n, int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return helper(n/10, c+1);//c+1
        }
        return helper(n/10, c);
    }
    public static void main(String[] args) {
        // int ans=sum(15534);
        // System.out.println("Digit sum is:"+ ans);

        // int ans =product(303);
        // System.out.println("product is:" +ans);
// reverse(42328);
//         System.out.println(sum);

System.out.println( count(3020000));
    }
}
