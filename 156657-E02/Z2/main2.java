package Z2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class main2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("jeden");
        list.add("dwa");
        list.add("trzy");

        print(list);

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("pierwszy");
        ll.add("drugi");
        ll.add("trzeci");
        print(ll);
    };

    public static <T> void print(Iterable<T> object) {
        for (T o : object) {
            System.out.printf("[" + o + "]" + ", ");
        }
        System.out.println(" ");
    }
}
