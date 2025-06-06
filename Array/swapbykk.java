package Array;
import java .util.*;

public class swapbykk {
    public static void main(String[] args) {
        int arr[]={1,2,85,55,45};
        swap(arr, 0, 2);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[]arr, int index1, int index2){
        int temp= arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
