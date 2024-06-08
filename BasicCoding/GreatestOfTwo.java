package BasicCoding;
import java.util.*;
public class GreatestOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        System.out.println("Greatest of three number is: "+greatest3(num1,num2,num3));
    }

    public static int greatest2(int num1,int num2){
        if(num1>num2){
            return num1;
        }
        else
            return num2;
    }

    public static int greatest3(int num1,int num2,int num3){
        if(num1>num2 && num1>num3){
            return num1;
        } else if (num2>num1 && num2>num3) {
            return num2;
        }
        else
            return num3;
    }
}
