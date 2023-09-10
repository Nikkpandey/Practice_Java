package OOPS;
public class GroceryMart {
    public static void main(String[] args){
        CustomerInfo myAccount=new CustomerInfo();
        myAccount.setCustomer_name("Nikhil");
        myAccount.setPhone_no("9897615124");
        myAccount.setAccount_balance(500.59);
        myAccount.setCustomer_address("India");

        myAccount.Shop(499.59);
        myAccount.Shop(600);
    }

}
