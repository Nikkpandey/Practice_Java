package Lambda;
interface Expression{
    public void say();
}
public class MyFirstLambda {
    public static void main(String[] args) {
     Expression e=()->{
         System.out.println("Lambda expression");
     };
     e.say();
    }
}
