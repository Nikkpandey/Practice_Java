package nikhil;
import java.util.*;
class Check {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        boolean product=checkProduct(a,b,c);
        System.out.println(product);

    }

    public static boolean checkProduct(int a,int b,int c){
        if((a*b)==c){
            return true;
        }
        else
            return false;
    }
}
