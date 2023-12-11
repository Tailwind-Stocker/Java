import java.util.Scanner;

interface VolCal {
    double VolCub(double l , double b , double h);
}

class Cuboid implements VolCal{
    public double VolCub(double l , double b , double h){
        return l*b*h;
    }
}

class VolumeCuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of cuboid: ");
        double l = sc.nextDouble();
        System.out.println("Enter breadth of cuboid: ");
        double b = sc.nextDouble();
        System.out.println("Enter height of cuboid: ");
        double h = sc.nextDouble();
        Cuboid cub = new Cuboid();
        double volume = cub.VolCub(l, b, h);
        System.out.println("The volume of cuboid is : " + volume);
    }
}