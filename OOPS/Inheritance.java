package OOPS;
import java.util.*;
public class Inheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please choose the product: ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Press 1 for fruits");
        System.out.println("Press 2 for vegetable");
        System.out.println("Press 3 for drink");
        System.out.println("Press 4 for snacks");
        System.out.println("Press 5 for sweets");
        System.out.println("Please select item from above list.");
        int item_code= sc.nextInt();
        Wallet wallet=new Wallet();
        String item_name=wallet.list(item_code);
        double price=wallet.price(item_name);
        wallet.bill(price);
    }
}
