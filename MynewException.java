public class MynewException {
    public static void main(String[] args) {
        UserDefineException obj = new UserDefineException();
        try{
            obj.validate(20);
        }
        catch(InvalidageException a){
            System.out.println(a.getMessage());
        }
    }
}
