package CollectionPractice;
import java.util.LinkedList;

public class LinkedListPrac {
    public static void main(String[] args) {
        LinkedList<Integer> ls=new LinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);

        ls.add(2,5);

        System.out.println("List is: "+ls);
    }
}
