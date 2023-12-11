import java.util.Scanner;

abstract class Area_Vol {
    abstract double Vol(double l , double b, double h);
    abstract double Area(double l, double b, double h);
}

class result extends Area_Vol {
    double Vol(double l , double b, double h){
        return l*b*h;
    }
    double Area(double l , double b, double h){
        return 2*((l*b) + (b*h) + (h*l));
    }
}
class AreaVol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, breadth & height : ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        result r = new result();
        System.out.println("Area of Cuboid: " + r.Area(l, b, h));
        System.out.println("Volume of Cuboid : " + r.Vol(l, b, h));
    }
    
}