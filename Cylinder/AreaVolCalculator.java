package Cylinder;
import java.util.*;
public class AreaVolCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double circle_radius= sc.nextDouble();
        double cylinder_radius= sc.nextDouble();
        double height= sc.nextDouble();

        Circle circle=new Circle(circle_radius);
        System.out.println("Circle radius= "+circle.getRadius());
        System.out.println("Circle area= "+circle.getArea());

        Cylinder cylinder=new Cylinder(cylinder_radius,height);
        System.out.println("Cylinder height= "+cylinder.getHeight());
        System.out.println("Cylinder area= "+cylinder.getArea());
        System.out.println("Cylinder volume= "+cylinder.getVolume());
    }
}
