package nikhil;
class Parent {
    public void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent{
    public void display() {
        System.out.println("Child");
    }
}

class Main{
    public static void doDisplay( Parent p ) {
        p.display();
    }
    public static void main(String[] args) {
        Parent a = new Parent();
        Parent b = new Child();
        Child c= new Child();
        doDisplay(a);
        doDisplay(b);
        doDisplay(c);
    }
}