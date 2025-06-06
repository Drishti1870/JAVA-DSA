package Recursion;

import java.util.Scanner;

public class Series {
    static  int sumSeries(int n){
        if(n==0){
            return 0;
        }
        return sumSeries(n-1) +n;
    }
    static  int sumSeriesMinus(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){//even
            return sumSeriesMinus(n-1)-n;
        }else {
            return sumSeriesMinus(n-1) + n;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
//      int ans=  sumSeries(n);
//        System.out.println(ans);

        int ans=sumSeriesMinus(n);
        System.out.println(ans);
    }
}
