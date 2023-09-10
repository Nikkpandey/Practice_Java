package nikhil;
import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int palin= sc.nextInt();
        System.out.println(isPalindrome(palin));

    }

    public static boolean isPalindrome(int num){
        int reverse=0, temp=num;
        while (temp != 0) {

            reverse=(reverse*10)+(temp%10);
            temp=temp/10;
        }
        if(num==reverse)
            return true;
        else
            return false;
    }
}
