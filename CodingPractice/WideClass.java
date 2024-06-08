package CodingPractice;

class Cast1{
    void show1(){
        System.out.println("Super class");
    }
}

class Cast2 extends Cast1{
    void show2(){
        System.out.println("Sub class");
    }
}
public class WideClass {
    public static void main(String[] args) {
        Cast1 c1;
        c1 = (Cast1) new Cast2();
        c1.show1();
    }
}
