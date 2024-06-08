package nikhil;

public class Ternary {
    public static void main(String[] args){
        boolean isTrue=false;
        boolean numberIs=isTrue?true:false;

        if(!numberIs){
            System.out.println("The number is true");
        }

        int truckHeight=50;
        boolean truckAllow=truckHeight==50?true:false;
        if(truckAllow){
            System.out.println("Truck allowed to cross the bridge");
        }

    }
}
