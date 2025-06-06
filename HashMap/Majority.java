package HashMap;
import java.util.*;
public class Majority {
    public static void main(String[] args, HashMap<Integer, Integer> map) {
        int arr[]= {1,2,3,5,1,5,3,1,1};
        HashMap<Integer, Integer> hm= new HashMap<>();
        for(int i=0; i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);

            }else{
                map.put(arr[i],1);
            }
        }
        Set <Integer>keySet=map.keySet();
        for(Integer key:keySet){
            if(map.get(key)>arr.length/3){
                System.out.println(key);
            }
        }
    }
}
