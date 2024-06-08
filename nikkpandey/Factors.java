package nikkpandey;
import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        printFactors(num);
    }

    public static void printFactors(int a) {
        if (a < 0) {
            System.out.println("Invalid value");
        } else
        {
            for (int i = 1; i <= a; i++)
            {
                if ((a % i == 0))
                {
                    System.out.println("Factors are: " + i + " ");
                }
            }
        }
        System.out.println();
    }
}