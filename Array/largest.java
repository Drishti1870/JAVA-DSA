package Array;
import java.util.*;

public class largest {
    static int occurence(int[]arr, int x){
        int count=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Eneter elements");
        for(int i=0; i<=arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enyer occurence value");
        int x= sc.nextInt();
        System.out.println(occurence(arr, x));
    }
    }
    

