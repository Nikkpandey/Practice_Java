package nikkpandey;
import java.util.*;
public class CommanDivisior {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(getGreatestCommonDivisor(a,b));

    }

    public static int getGreatestCommonDivisor(int num1,int num2){
        int greatest=0;
        if(num1>10 && num2>10){
        for(int i = 1; ((i <= num1) && (i <=num2)); i++ ){
            if((num1 % i == 0) && (num2 % i == 0)){
                greatest = i;
            }
        }
        return greatest;
    }
        else
                return -1;
        }
    }
