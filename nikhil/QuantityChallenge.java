package nikhil;

public class QuantityChallenge {
    public static void main(String[] args){
        float petrol_price=84.11f;
        float diesel_price=74.91f;
        float budget=1546.12f;

        float petrol_quantity=budget/petrol_price;
        float diesel_quantity=budget/diesel_price;

        System.out.println("Quantity of petrol that can be by in the budget of "+budget+" is: "+petrol_quantity);
        System.out.println("Quantity of petrol that can be buy in the budget of "+budget+" is: "+diesel_quantity);

        double petrol_price1=84.11d;
        double diesel_price1=74.91;
        double budget1=1546.12;

        double petrol_quantity1=budget1/petrol_price1;
        double diesel_quantity1=budget1/diesel_price1;

        System.out.println("Quantity of petrol that can be by in the budget of "+budget1+" is: "+petrol_quantity1);
        System.out.println("Quantity of petrol that can be buy in the budget of "+budget1+" is: "+diesel_quantity1);
    }
}
