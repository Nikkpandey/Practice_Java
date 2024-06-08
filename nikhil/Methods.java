package nikhil;

public class Methods {
    public static void add(int a, int b){
        int sum=a+b;
        System.out.println("Sum is: "+ sum);
    }
    public static void sub(int a, int b){
        int diff=a-b;
        System.out.println("Difference is: "+diff);
    }

    public static void main(String[] args){
        add(20,43);
        sub(10,5);

        double topSpeed=speedOfTrain(200,20);
        double x=2*topSpeed;
        System.out.println(x);
    }

    public static double speedOfTrain(double distance, double time) {
        if (distance == 100) {
            double speed = distance / time;
            return speed;
        }
        else
            return 0;
    }
}
