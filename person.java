public class person {
    private String address;
    public person(String address) {
        this.address = address;
    }

    public void getAddress() {
        System.out.println("Address is : " + address);
    }
}
class schoolStudent extends person{
    public String course;
    public schoolStudent(String address, String course) {
        super(address);
        this.course = course;
    }

    public void getCourse(){
        System.out.println("Course is : "+course);
    }

    public static void main(String[] args) {
        person s1 = new person("Ghaziabad");
        s1.getAddress();
        schoolStudent s2 = new schoolStudent("Ghaziabad","Btech");
        s2.getAddress();
        s2.getCourse();
    }
}
