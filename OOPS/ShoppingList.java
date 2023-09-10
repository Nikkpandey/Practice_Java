package OOPS;

public class ShoppingList {
    public static String list(int item_code){
        String item_name=" ";
        switch (item_code){
                case 1:
                item_name="Fruits";
                System.out.println("Item name is: "+item_name);
                return item_name;

                case 2:
                item_name="Vegetable";
                System.out.println("Item name is: "+item_name);
                return item_name;

                case 3:
                    item_name="Drinks";
                    System.out.println("Item name is: "+item_name);
                    return item_name;

            case 4:
                item_name="Snacks";
                System.out.println("Item name is: "+item_name);
                return item_name;
            case 5:
                item_name="Sweets";
                System.out.println("Item name is: "+item_name);
                return item_name;
            default:
                System.out.println("Sorry the item is not available");
                break;
        }
        return item_name;
    }
}
