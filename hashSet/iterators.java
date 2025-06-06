package hashSet;
import java.util.*;

public class iterators {
    public static void main(String[] args) {
        HashSet<String> cities= new HashSet<>();
        cities.add("Bengaluru");
        cities.add("Noida");
        cities.add("Mumbai");
        cities.add("Pune");

        System.out.println("---------------By iterators---------------");
        //iterators method
        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("----------------By Advanced loop method-----------------");
        for(String city:cities){
            System.out.println(city);
        }
    }
}
