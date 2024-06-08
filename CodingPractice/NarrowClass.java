package CodingPractice;

class A{
    void run1(){
        System.out.println("Super class");
    }
}

class B extends A{
    void run2(){
        System.out.println("Sub Class");
    }
}
public class NarrowClass {
    public static void main(String[] args){
        A a;
        a=new B();
        B b=(B) a;
        b.run1();
        b.run2();
    }
}
