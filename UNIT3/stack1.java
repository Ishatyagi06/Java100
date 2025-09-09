package UNIT3;
import java.util.*;
public class stack1 {
    public static void main(String[] args) {
        Stack<String> stk = new Stack<>();
        stk.push("Isha");
        stk.push("Ishi");
        stk.push("Ishu");
        System.out.println(stk.peek());
        System.out.println(stk.size());
        stk.pop();
        System.out.println(stk.size());
    }
}
