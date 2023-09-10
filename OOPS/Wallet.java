package OOPS;
import java.util.*;
public class Wallet extends ShoppingCart{

    double wallet_balance=500.00;
    public static void balance(){
        double balance=0.0;
        System.out.println("Your current balance is: "+balance);
    }

    public void recharge(double amount){
        wallet_balance=wallet_balance+amount;
        System.out.println("Thanks for recharging.");
        System.out.println("Your current balance is: "+wallet_balance);
    }

    public void balance_update(double item_price){
        wallet_balance=wallet_balance-item_price;
        System.out.println("Your Updated balance= "+wallet_balance);
    }
    public void bill(double item_price){
        if(item_price<wallet_balance){
            System.out.println("Thanks for purchasing");
            balance_update(item_price);
        } else if (item_price>wallet_balance) {
            System.out.println("Balance is low!!!!!!");
            double low_balance=item_price-wallet_balance;
            System.out.println("Add "+low_balance+" for buy the item");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the money to add: ");
            double amount= sc.nextDouble();
            recharge(amount);
        }
    }
}
