package BasicCoding;
import java.util.*;
public class EvenOdd {
    public static void evenOdd(int num){
        if(num>0){
            String result=num%2==0?"Even":"Odd";
            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();

        evenOdd(num);
    }
}
