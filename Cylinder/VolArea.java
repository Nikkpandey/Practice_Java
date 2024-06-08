package Cylinder;
import java.util.*;
public class VolArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double rect_length= sc.nextDouble();
        double rect_width= sc.nextDouble();

        double cub_height= sc.nextDouble();

        Rectangle rectangle=new Rectangle(rect_length,rect_width);
        System.out.println("Rectangle length= "+rectangle.getLength());
        System.out.println("Rectangle width= "+rectangle.getWidth());
        System.out.println("Rectangle area= "+rectangle.getArea());

        Cuboid cuboid=new Cuboid(rectangle,cub_height);
        System.out.println("Cuboid height= "+cuboid.getHeight());
        System.out.println("Cuboid volume= "+cuboid.getVolume());
    }
}
