package pl.edu.uwm.wmii.marcelmrozowski.laboratorium10;
import java.util.*;

public class Zad8Lab10 {
    public static <E extends Iterable<?>> void print (E o ){
        Iterator <?> iterator = o.iterator();
        while(iterator.hasNext()) {
            System.out.println( iterator.next());
            if(iterator.hasNext()){
                System.out.println(", ");
            }
        }
    }
}
