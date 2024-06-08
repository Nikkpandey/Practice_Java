package Practice;
import java.util.*;
public class NaturalNumber {
    public static void reverseOrder(int num){
        while(num!=0) {
            System.out.print(num+" ");
            num--;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
       reverseOrder(num);
    }
}
