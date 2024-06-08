package BasicCoding;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        System.out.print("The Fib number is: "+Fib(num));

        System.out.print("\nThe Tri number is: "+Tri(num));
    }

    public static int Fib(int num){
        if(num<=2){
            return 1;
        }
        else
            return Fib(num-1)+Fib(num-2);
    }

    public static int Tri(int num){
        if(num==0){
            return 0;
        }
        if(num<=2){
            return 1;
        }
        return Tri(num-1)+Tri(num-2)+Tri(num-3);
    }
}
