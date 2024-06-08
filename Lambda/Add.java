package Lambda;
interface addable{
    public int add(int a,int b);
}
public class Add {
    public static void main(String[] args) {
        addable p=(a,b)->(a+b);
        System.out.println(p.add(10,20));
        System.out.println(p.add(100,200));
    }
}
