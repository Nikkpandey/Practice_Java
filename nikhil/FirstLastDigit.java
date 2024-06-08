package nikhil;
import java.util.*;
public class FirstLastDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num=sc.nextInt();
        System.out.println("Sum of last and first digit: "+sumFirstAndLastDigit(num));
    }

    public static int sumFirstAndLastDigit(int number){
        if(number<0)
            return -1;
        int first=0, last=number%10;
        number=number/10;

        while(number!=0){
            if(number/10==0)
                first=number%10;
            number=number/10;
        }
        return first+last;
    }
}
