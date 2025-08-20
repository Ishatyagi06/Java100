abstract class Student1 {
    String name;
    int roll_no;

    abstract void attend_class();
    abstract void give_exam();

    public Student1(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }
}
