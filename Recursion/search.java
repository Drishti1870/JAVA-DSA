package Recursion;

public class search {
    public static int linearSearch(int arr[], int searchElement){
        int n=arr.length;
       
        for(int i=0; i<arr.length;i++){
            if(searchElement==arr[i]){
return i;

            }
        }
        return -1;

    }
    public static void main(String[] args) {
        
        int[] arr= {10,20,30,50,70,90};    
        int searchElement= 50;    
        System.out.println(searchElement+" is found at index: "+linearSearch(arr, searchElement));  
    }
}
