package UNIT3;


import java.util.*;

public class arraylist2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter the number of names : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        System.out.println(list);
        Collections.sort(list);

        System.out.println(list);
        Iterator it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
