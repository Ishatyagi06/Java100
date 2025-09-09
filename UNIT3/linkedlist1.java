package UNIT3;
import java.util.*;
public class linkedlist1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Isha");
        ll.add("Naina");
        ll.add("Aru");
        ll.add("Gujju");
        ll.add("Tulli");
        Iterator itr = ll.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ll.remove("Aru");
        ll.add("Mahi");
        System.out.println(ll);
    }
}
