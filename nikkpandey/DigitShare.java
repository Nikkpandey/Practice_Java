package nikkpandey;
import java.util.*;
public class DigitShare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a= sc.nextInt();
        System.out.println("Enter second number: ");
        int b= sc.nextInt();
        System.out.println(hasSharedDigit(a,b));
    }

    public static boolean hasSharedDigit(int a, int b){
        boolean answer = false;
        int lefta = a/10;
        int righta = a % 10;
        int leftb = b/10;
        int rightb = b % 10;
        if(lefta == leftb || lefta== rightb || righta==leftb || righta== rightb){
            answer = true;
        }
        return answer;
    }
}
