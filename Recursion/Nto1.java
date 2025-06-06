package Recursion;

public class Nto1 {
    static void fun(int n){
        if(n==6){//jb tk zero na ho jaye
            return;
        }
        System.out.println(n);
        fun(n+1);
    }
    public static void main(String[] args) {
        fun(1);
    }
}
