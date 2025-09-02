package UNIT1;

public class calculator {
    double ar;
    // method overloading
    public void Area(double l, double b){
        ar = l*b;
        System.out.println("Area of rectangle "+ar);
    }
    public void Area(double r){
        ar = Math.PI*r*r;
        System.out.println("Area of circle "+ar);
    }
    public void Area(double l, double b,double h){
        ar = 2*(l*b+ b*h + h*l);
        System.out.println("Area of cuboid "+ar);
    }

    public static void main(String[] args) {
        calculator c1 = new calculator();
        c1.Area(12.3,24.5);
        c1.Area(4.0);
        c1.Area(12,4,11);
    }
}
