package UNIT3;
import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(23);
        list.add(67);
        System.out.println(list);
        for(Integer el : list){
            System.out.println(el);
        }
    }
}
