package GenericPrac;
//Generic Class to store any type of obj

class MyClass1<T>{
    T obj;

    //constructor to initialize T type object
    MyClass1(T obj){
        this.obj=obj;
    }

    //method to return T type object
    T getObj(){
        return obj;
    }
}
public class Gen1 {
    public static void main(String[] args) {
        //Create Integer class object
        Integer i=12; // same as Integer i=new Integer(12);

        //Create MyClass object and store Integer obj in it
        MyClass1<Integer> obj=new MyClass1<>(i);

        //retrieve Integer object by calling getobj()
        System.out.println("Stored: "+obj.getObj());

        Float f=123.32f;

        MyClass1<Float> obj2=new MyClass1<>(f);

        System.out.println("Stored :"+obj2.getObj());

        MyClass1<String> obj3=new MyClass1<>("Nikhil Pandey");

        System.out.println("Stored: "+obj3.getObj());
    }
}
