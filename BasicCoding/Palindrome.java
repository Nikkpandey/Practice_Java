package BasicCoding;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(int num){
        int rev=0;
        int originalNo=num;

        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        return originalNo==rev;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();

        boolean isPalindromeNumber=isPalindrome(num);
        if(isPalindromeNumber){
            System.out.println(num+" is palindrome.");
        }
        else
            System.out.println(num+" is not a palindrome.");
    }
}
