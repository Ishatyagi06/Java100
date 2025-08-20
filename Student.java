public class Student {
    int roll_no;
    String name;
    // if in a class there are more than 1 constructor is known as constructor overloading
    Student() // Default constructor
    {
        System.out.println("I am a default constructor");
    }
    Student(int r, String n){
        roll_no = r;
        name = n;
    }

    Student(Student s) // Java does not support copy constructor but we can initialise it
    {
        roll_no = s.roll_no;
        name = s.name;
    }
    public void display(){
        System.out.println("Roll no "+roll_no+" Name "+name);
    }
}

