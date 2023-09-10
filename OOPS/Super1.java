package OOPS;
class One{
    int i=10;
    void show(){
        System.out.println("Superclass method:i= "+i);
    }
}
class Two extends One{
    int i=20;

    @Override
    void show() {
        System.out.println("Subclass method:i= "+i);
        super.show();
        System.out.println("Super i= "+super.i);
    }
}
public class Super1 {
    public static void main(String[] args){
        Two t=new Two();
        t.show();
    }
}
