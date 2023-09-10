package Practice;
import java.util.*;
import java.lang.Math;
public class Prime1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        String check=primeCheck(num)?"Prime Number":"Not a Prime Number";
        System.out.println(check);
    }

    public static boolean primeCheck(int num){
        if(num<2){
            return false;
        }
        else
        {
            for (int i = 2; i <= Math.sqrt(num); i++)
            {
                if (num % i == 0) {
                    return false;
                }
            }
        }
       return true;
    }
}
