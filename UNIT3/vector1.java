package UNIT3;
import java.util.*;
public class vector1 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>(3,5);
        vec.add("Isha");
        vec.add("Ishu");
        vec.add("Ishi");
        vec.add("Ishh");
        System.out.println(vec.capacity());
        System.out.println(vec.size());
    }
}
