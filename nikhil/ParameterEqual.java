package nikhil;
import java.util.*;
public class ParameterEqual {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        printEqual(a,b,c);

    }

    public static void printEqual(int num1, int num2, int num3)
    {
        if((num1<0) ||(num2<0) ||(num3<0))
    {
        System.out.println("Invalid value");
    }
        else if((num1==num2) &&(num1==num3) &&(num2==num3))
        {
            System.out.println("All numbers are equal");
        }
        else if ((num1!=num2) && (num1!=num3) && (num2!=num3))
        {
            System.out.println("All numbers are different");
        }
        else
            System.out.println("Neither all are equal or different");
    }
}
