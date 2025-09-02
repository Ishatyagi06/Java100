package UNIT1;

public class Mybank {
    public static void main(String[] args) {
        Bank obj = new Bank();
        try{
            obj.withdraw(2000);
        }
        catch(InsufficientBalanceException a){
            System.out.println(a.getMessage());
        }
    }
}
