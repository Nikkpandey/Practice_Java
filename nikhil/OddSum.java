package nikhil;
import java.util.*;
public class OddSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num= sc.nextInt();
        System.out.println("The Sum is : "+getOddDigitSum(num));
    }

    public static int getOddDigitSum(int number){
        if(number<0)
            return -1;

        int sum=0;
        while(number!=0){
            if((number%10)%2!=0)
                sum+=(number%10);
                number/=10;
        }
        return sum;
    }
}
