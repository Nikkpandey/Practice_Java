package OOPS;
class Commercial{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void calculateBill(int units){
        System.out.println("Customer: "+getName());
        System.out.println("Bill amount: "+units*5.00);
    }
}

class Domestic extends Commercial{
    @Override
    void calculateBill(int units) {
        System.out.println("Customer: "+getName());
        System.out.println("Bill amount: "+units*2.50);
    }
}

class ElectricityBill {
    public static void main(String[] args) {
        Commercial commercial=new Commercial();
        commercial.setName("Nikhil");
        commercial.calculateBill(100);
        Domestic domestic=new Domestic();
        domestic.setName("Adarsh");
        domestic.calculateBill(100);
    }

}
