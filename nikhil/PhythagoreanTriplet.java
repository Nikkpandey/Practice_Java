package nikhil;
import java.util.*;
class PythagoreanTriplet {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        checkTriplet(a,b,c);

    }

    public static void checkTriplet(int a, int b, int c){
        int p=a*a;
        int q=b*b;
        int r=c*c;

        if((p+q)==r){
            System.out.println(a+" "+" "+b+" "+" and "+c+" are pythagorean triplets");
        }
        else{
            System.out.println(a+" "+" "+b+" "+" and "+c+" are not pythagorean triplets");
        }
    }
}
