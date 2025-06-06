package HashMap;
import java.util.*;

public class hash2 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm= new HashMap<>();
        hm.put("India", 50);
        hm.put("Us", 100);
        hm.put("Nepal", 102);
        hm.put("Indonesia", 00);
        hm.put("Nainital", 200);

        //for iteration we used foreach loop
        Set<String>keys=hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("keys="+k+",value="+hm.get(k));
        }

    }
}
