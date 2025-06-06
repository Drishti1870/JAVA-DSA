package Array;
import java .util.*;

public class arrays {
    // static void printArray(int[]arr){
    //     for(int i=0; i<arr.length;i++){
    //         System.out.println(arr[i]+",");
    //     }
    //     System.out.println();
    // }
    static int[] reverseArray(int arr[]){
        int n=arr.length;
        int[]ans=new int[n];
        int j=0;
        //traverse original array in reverse direction
        for(int i=n-1;i>=0;i--){
            arr[j++]=arr[i];
        }
        return ans;

    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int [] ans= reverseArray(arr);
       System.out.println(ans);
        
    }
}
