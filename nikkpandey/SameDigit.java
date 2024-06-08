package nikkpandey;
import java.util.*;
public class SameDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        System.out.println(hasSameLastDigit(a,b,c));
    }

    public static boolean hasSameLastDigit(int first,int second,int third){
        if ((first>= 10 && first<= 1000) && (second>= 10 && second<= 1000) && (third>= 10 && third<= 1000)) {
            return ((first % 10 == second % 10) || (first % 10 == third % 10) || (second % 10 == third% 10));
        }
        return false;
    }
}
