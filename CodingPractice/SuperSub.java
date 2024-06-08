package CodingPractice;


class One1{
    int i=10;
    void show(){
        System.out.println("Superclass method:i= "+i);
    }
}

class Two2 extends One1{
    int i=20;
    void show(){
        System.out.println("sub class method:i: "+i);
        super.show();
        System.out.println("super class i: "+super.i);
    }
}
public class SuperSub {
    public static void main(String[] args){
        Two2 t=new Two2();
        t.show();
    }
}
