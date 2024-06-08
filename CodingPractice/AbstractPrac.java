package CodingPractice;

abstract class MyClass{
    abstract void calculate(double x);
}
class Sub1 extends MyClass{
    void calculate(double x){
        System.out.println("Square: "+(x*x));
    }
    void calculate2(double x){
        System.out.println("Addition: "+(x+x));
    }
}

class Sub2 extends MyClass{
    void calculate(double x){
        System.out.println("Square root: "+Math.sqrt(x));
    }
}
public class AbstractPrac {
    public static void main(String[] args){
        Sub1 sub1=new Sub1();
        Sub2 sub2=new Sub2();
        sub1.calculate(2);
        sub1.calculate2(2);
        sub2.calculate(2);
    }
}
