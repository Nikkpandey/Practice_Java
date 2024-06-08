package OOPS;

public class ShoppingCart extends ShoppingList{
    public static double price(String item_name) {
        double price=0;
        if(item_name=="Fruits"){
            return 44.78;
        }else if (item_name=="Vegetable"){
            return 52.44;
        }
        else if(item_name=="Drinks"){
            return 40.00;
        } else if (item_name=="Snacks") {
            return 76.32;
        } else if (item_name=="Sweets") {
            return 234.87;
        }
        return price;
    }
}
