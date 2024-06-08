package BasicCoding;
import java.util.*;
public class DigitSum {

    public static int digitSumOfNo(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();

        System.out.print("The sum of digit of number is: "+digitSumOfNo(num));
    }
}
