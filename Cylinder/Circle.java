package Cylinder;

class Circle {
    private double radius;

    Circle(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        if(radius<0){
            radius=0;
            return radius;
        }
        else{
            return radius;
        }
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
}
