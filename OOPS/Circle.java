package OOPS;
public class Circle {
    private double radius=10;

    public double getArea(){
        return radius*radius*Math.PI;
    }
    public static void main(String[] args){
        Circle circle=new Circle();
        System.out.println("Radius of circle: "+circle.radius);
        System.out.println("Area of circle: "+circle.getArea());
    }
}
