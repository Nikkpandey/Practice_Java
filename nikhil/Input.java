package nikhil;
import java.util.*;
public class Input {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int area= rectArea(a,b);
        System.out.println("Area of rectangle: "+area);
    }

    public static int rectArea(int a,int b){
        int area=2*(a+b);
        return area;
    }
}
