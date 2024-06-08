package nikhil;
import java.util.*;
class RemSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int rem;
        int sum=0;

        do {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        } while (n != 0);
        System.out.println("The sum of the number "+n+" is: "+sum);
    }
}
