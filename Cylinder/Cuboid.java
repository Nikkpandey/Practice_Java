package Cylinder;

class Cuboid extends Rectangle{
    private double height;
    Rectangle rectangle;

    Cuboid(Rectangle rectangle,double height){
        if(height<0){
            height=0;
            this.height=height;
        }
        else {
            this.height=height;
        }
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return rectangle.getArea()*getHeight();
    }
}
