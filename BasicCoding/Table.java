package BasicCoding;

import java.util.Scanner;

public class Table {
    static void multiples(int num) {
        int i=1;
        while(i<=10){
            System.out.println(num+" * "+i+" ="+num*i);
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        multiples(num);
    }
}
