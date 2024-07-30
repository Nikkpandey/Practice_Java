package GenericPrac;
//WAP to create generic interface and also make a implementation class

interface Fruit<T>{
    //method that accept any obj
    void tellTaste(T fruit); //public abstract
}

class AnyFruit<T> implements Fruit<T>{
    public void tellTaste(T fruit){
        //know the class name of obj passed to this method
        String fruitName=fruit.getClass().getSimpleName();

        //decide taste and display
        if(fruitName.equals("Banana"))
            System.out.println("Banana is sweet");

        else if(fruitName.equals("Orange"))
            System.out.println("Orange is sour");

    }
}

class Banana{

}

class Orange{

}

public class Gen3 {
    public static void main(String[] args) {
        Banana b=new Banana();
        AnyFruit<Banana> fruit1=new AnyFruit<>();
        fruit1.tellTaste(b);

        Orange o=new Orange();
        AnyFruit<Orange>fruit2=new AnyFruit<>();
        fruit2.tellTaste(o);
    }
}
