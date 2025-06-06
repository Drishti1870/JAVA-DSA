package Array;
import java .util.*;
public class ReverseBytwopointer{
    public static void main(String[] args) {
        int arr[]={2,5,58,6,56,332};
       
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int []arr){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int arr[], int idx1, int idx2){
        int temp= arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;

    }
}
