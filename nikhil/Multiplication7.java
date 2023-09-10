package nikhil;
import java.util.*;
class Multiplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num= sc.nextInt();
        table(num);

    }

    public static void table(int i){
            for(int j=10; j>=1; j--){
                int mul=i*j;
                System.out.println(" "+i+" * "+j+" = "+mul);
            }
        }
}

