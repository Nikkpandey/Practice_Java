package CodingPractice;

class OneClass{
    void calculate(double x,double y){
        System.out.println("Square Value:"+(x*y));
    }
}

class TwoClass extends OneClass{
    void calculate(double x){
        System.out.println("Square root: "+Math.sqrt(x));
    }
}
public class DynaPoly {
    public static void main(String args[]){
        TwoClass two=new TwoClass();
        two.calculate(2,3);
    }
}
