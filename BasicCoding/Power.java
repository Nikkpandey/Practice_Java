package BasicCoding;
import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");//2
        int x=sc.nextInt();
        System.out.print("Enter the power: ");//3
        int pow= sc.nextInt();

        System.out.print("The answer: "+powerOfNum(x,pow));


    }

    public static int powerOfNum(int x,int pow) {
        if (pow != 0) {
            return x * powerOfNum(x, pow - 1);
        } else
            return 1;
    }
}
