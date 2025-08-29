import java.io.DataInputStream;
import java.util.*;
public class myexception {
    public static void main(String[] args) {
        int x,y,z = 0;
        DataInputStream dis = new DataInputStream(System.in);

        try
        {
            x = dis.readInt();
            y = dis.readInt();
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
