package nikkpandey;
import java.util.*;
public class NumberPerfect {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        System.out.println(isPerfectNumber(num));
    }

    public static boolean isPerfectNumber(int number){
        int count =0;

        if(number > 0)
        {
            for (int i = 1; i < number; i++)
            {
                if (number % i == 0) {
                    count = count + i;
                }
            }
        }

        if(count > 1)
        {
            return true;
        }

        return false;
    }
}
