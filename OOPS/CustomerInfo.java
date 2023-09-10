package OOPS;

public class CustomerInfo {
    private String customer_name;
    private String customer_id;
    private String phone_no;
    private double account_balance;
    private String customer_address;

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
    public String getCustomer_name(){
        return customer_name;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public double getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public void Shop(double amount){
        if(account_balance>=amount){
            double remBal=account_balance-amount;
            System.out.println("Thanks for shopping. Your remaining balance is "+remBal);
            account_balance=remBal;
        }else
        {
            double low=amount-account_balance;
            System.out.println("Insufficient Balance. Add money "+low);
        }
    }

    public void rechargeAccount(double recharge){
        account_balance=account_balance+recharge;
        System.out.println("Thanks for recharging. Your current balance is "+account_balance);
    }
}
