package nikhil;
import java.util.*;
class Area {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length: ");
        int length= sc.nextInt();
        System.out.println("Enter Breadth: ");
        int breadth=sc.nextInt();
        System.out.println("Enter Height: ");
        double height= sc.nextDouble();

        area(length);
        area(length,breadth);
        area(breadth,height);

    }

    public static double area(int length){
        double area=(length*length);
        System.out.println("Area of square= "+area);
        return area;
    }

    public static double area(int length,int breadth){
        double area=(length*breadth);
        System.out.println("Area of rectangle= "+area);
        return area;
    }

    public static double area(int breadth,double height){
        double area=(height*breadth)/2;
        System.out.println("Area of triangle: ");
        return area;
    }
}
