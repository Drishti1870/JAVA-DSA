package OOps;

public class MethodOverloading {

    public static void main(String[] args) {
        Calculator c1=new Calculator();
       System.out.println(c1.Sum(22, 5));
        System.out.println( c1.Sum(8, 2));
        System.out.println(c1.Sum(4, 5, 9));

    }
}
class Calculator{
    int Sum(int a, int b){
        return a+b;
    }
    float Sum(float a, float b){
        return a+b;

    }
    int Sum(int a , int b, int c){
        return a+b+c;

    }
}