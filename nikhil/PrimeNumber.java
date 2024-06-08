package nikhil;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number= ");
        int number= sc.nextInt();
        for(int i=1; i<number; i++) {
            isPrimeNumber(i);
        }
    }

    public static void isPrimeNumber(int num){
        int count=0;
        for(int j=1; j<=num;j++){
        if((num%j)==0)
            count=count+1;
        }
        if(count ==2)
            System.out.println(num+" is a prime number");
    }
}
