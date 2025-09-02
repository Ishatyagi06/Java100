package UNIT1;

import java.util.*;
public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student obj1 = new Student(sc.nextInt(), sc.next());
        obj1.display();
        Student s2 = new Student(s1);
        s2.display();
    }
}
