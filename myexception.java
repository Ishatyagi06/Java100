import java.util.*;
public class myexception {
    public static void main(String[] args) {
        int x,y,z = 0;
        Scanner sc = new Scanner(System.in);
        try
        {
            x = sc.nextInt();
            y = sc.nextInt();
            z = x/y; // exception occurs
            System.out.println("Exception not occur");
        }

        catch(ArithmeticException a)
        {
            System.out.println(a.getMessage());
        }
        catch(InputMismatchException a){
            System.out.println(a);
        }
        catch(Exception a){
            System.out.println(a.getMessage());
        }
        finally{
            System.out.println("Result is "+z);
        }
    }
}
