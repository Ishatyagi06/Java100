package UNIT3;
import java.util.*;
public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<>();
        adq.add("1");
        adq.addFirst("0");
        adq.addLast("2nd");
        System.out.println(adq);
        System.out.println(adq.offerFirst("-1"));
        System.out.println(adq.offerLast("3"));
        System.out.println(adq);
    }
}
