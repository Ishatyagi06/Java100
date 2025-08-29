public class UserDefineException {
    public void validate(int age) throws InvalidageException{
        if(age<18)
            throw new InvalidageException("Cannot caste Vote, Age less than 18");
        else
            System.out.println("Eligible to vote");
    }
}
