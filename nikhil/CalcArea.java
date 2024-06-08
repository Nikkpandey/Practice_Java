package nikhil;
import java.util.*;

public class CalcArea {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the parameters: ");
        double length= sc.nextDouble();
        double breadth= sc.nextDouble();
        double radius= sc.nextDouble();

        System.out.println(circArea(radius));
        System.out.println(rectArea(length,breadth));

    }

    public static double circArea(double radius){
        if(radius<=0.0){
            return -1.0;
        }
        else
            return radius*radius*Math.PI;
    }

    public static double rectArea(double length,double breadth){
        if((length<0) || (breadth<0)){
            return -1.0;
        }
        return length*breadth;
    }
}
