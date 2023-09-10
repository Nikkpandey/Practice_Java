package BasicCoding;

import java.util.Scanner;

public class NaturalNumber {

    public static void number(int n) {
        int num =1;

        while (num<= n) {
            System.out.print(num +" ");
            num++;
        }
    }
}

    class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int num = sc.nextInt();

            NaturalNumber naturalNumber = new NaturalNumber();
            naturalNumber.number(num);

        }
    }
