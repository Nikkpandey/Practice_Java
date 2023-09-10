package nikhil;
import java.util.*;
public class CheckEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        int num2= sc.nextInt();
        System.out.println(sumEven(num,num2));
    }

    public static boolean isEven(int number){
        if(number<0){
            return false;
        }
        if(number%2==0){
            return true;
        }
        else
            return false;
    }

    public static int sumEven(int start,int end) {
        if(end<start)
            return -1;
        if((end<=0) ||(start<=0))
            return -1;
        int sum=0;
        for(int i=start; i<=end; i++){
            if(isEven(i))
                sum=sum+i;
        }
        return sum;
    }
}
