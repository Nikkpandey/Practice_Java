package CollectionPractice;
import java.util.HashSet;
public class HashSetPractice {
    public static void main(String args[]){
        HashSet<String> hs=new HashSet<>();
        hs.add("1");
        hs.add("2");
        hs.add("3");
        hs.add("1");


        System.out.println("HashSet: "+hs);

        hs.remove("2");
        System.out.println("HashSet: "+hs);
        System.out.println("Size: "+hs.size());

    }
}
