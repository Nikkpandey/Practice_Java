package nikhil;
import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int i=1;
        int table;

        while(i<=10){
            table=n*i;
            System.out.println(n+" *"+" "+i+" ="+" "+table);
            i++;
        }
    }
}
