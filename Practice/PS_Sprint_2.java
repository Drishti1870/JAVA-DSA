package Practice;
import java.util.*;

public class PS_Sprint_2 {
    //Question 1
/// Reverse a string
    static  void ReverseString(String str){
        System.out.println("Normal String " +str);
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String is: " + reversed);
    }

// Question 2 Largest and smallest number in array
    static  void LSArray(int arr[]){
        int largest=arr[0];
        int smallest= arr[0];

        int n=arr.length;
        for(int i=1; i<n;i++ ){
            if(arr[i]> largest){
                largest=arr[i];
            }
            if(arr[i]< smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Largest :" + largest);
        System.out.println("smallest :" + smallest);
    }
    //Question 3 sum of element of array
    static  void SumOfArray(int arr[]){
        int sum=0;
        for(int num: arr){
            sum+=num;
        }
        System.out.println(sum);
    }
//Question 4 find all armstrong in given range separated
    //Question 5 to generate multiply table
    static  void table(int num){

        for(int i=1;i<=10;i++){
            System.out.println(+num+ " * " + i +" = " +(num*i));

        }

    }
// question 6 range prime number separated
    //question 7 perfect number
    public  static  boolean isPerfectNumber(int num){
        int sum=0;
        if(num<6) return false;
        for(int i=1; i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }

        return sum==num;
    }
    //question 8 range of even number to print their sum
//    static  void EvenRange(int num){
//
//    }

    public static void main(String[] args) {
//            ReverseString("Hello World");
//        int arr[]={1,92,32,04,5};
//        LSArray(arr);
//        SumOfArray(arr);
//        table(4);
        //question 8
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter number");
int lower= sc.nextInt();
        System.out.println("ENter number");
        int upper= sc.nextInt();
        int sum=0;
         for(int i=lower; i<=upper;i++){
             if(i%2==0){
                 sum+=i;
             }
         }
         //question 9
        int oddsum=0;
        for(int i=lower;i<=upper;i++){
            if(i%2!=0){
                oddsum+=i;
            }
        }
        System.out.println("between given range sum of even will be" +sum);
        System.out.println("between given range sum of odd will be" +oddsum);

//        if(isPerfectNumber(num)){
//            System.out.println(num + " is perfect number");
//        }else{
//            System.out.println(num + " is not perfect number");
//        }
//    }



}}
