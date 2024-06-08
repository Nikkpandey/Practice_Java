package BasicCoding;
import java.util.*;
public class ReverseNo {

    public static void noReverse(int num){
        int num2=0;

        while(num!=0){
            num2=num%10;
            num=num/10;
            System.out.print(num2+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();

        noReverse(num);
    }
}
