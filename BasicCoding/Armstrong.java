package BasicCoding;
import java.util.*;
public class Armstrong {

    public static int order(int num){
        int len=0;

        while(num!=0){
            len++;
            num/=10;
        }
        return len;
    }

    public static boolean isArmstrong(int num,int order){
        int sum=0,temp,digit;
        temp=num;

        while(temp!=0){
            digit=temp%10;
            sum=(int)(sum+Math.pow(digit,order));
            temp/=10;
        }
        return num==sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();

        int len=order(num);

        if(isArmstrong(num,len)){
            System.out.println("Armstrong number");
        }
        else
            System.out.println("Not Armstrong number");
    }
}
