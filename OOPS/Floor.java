package OOPS;
import java.util.*;
class Floor {
    private double width;
    private double length;

    Floor(double width, double length) {
        if(width<0){
            this.width=0;
        }
        else
           this.width = width;
        if(length<0){
            this.length=0;
        }
        else
        this.length = length;
    }

    public double getArea(){
        return length*width;
    }
}

class Carpet{
    private double cost;

    Carpet(double cost){
        if(cost<0){
            this.cost=0;
        }
        else
            this.cost=cost;
    }

    public double getCost() {
        return cost;
    }
}

class Calculator{
    Floor floor;
    Carpet carpet;

    Calculator(Floor floor, Carpet carpet){
        this.floor=floor;
        this.carpet=carpet;
    }
    public double getTotalCost(){
        return floor.getArea()* carpet.getCost();
    }
}

class CarpetCostCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double cost= sc.nextDouble();
        double f_width= sc.nextDouble();
        double f_height= sc.nextDouble();

        Carpet carpet=new Carpet(cost);
        Floor floor=new Floor(f_width,f_height);
        Calculator calculator=new Calculator(floor,carpet);
        System.out.println("Total: "+calculator.getTotalCost());
    }
}
