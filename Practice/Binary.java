package Practice;
import java.util.*;
public class Binary {

    public static long convert(long num){
        int i=0,decimal=0;

        while(num!=0){
            long digit=num%10;
            decimal+=digit*Math.pow(2,i);
            num/=10;
            i++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        long num= sc.nextLong();

        System.out.println(convert(num));
    }
}
