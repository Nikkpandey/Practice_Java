package Hash;
import java.util.HashSet;
import java.util.Set;
public class HashSetUse {

    public static void main(String[] args) {
        Set<String>fruits=new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        System.out.println(fruits);

        boolean containsApple= fruits.contains("apple");
        System.out.println("Contains apple:"+containsApple);

        fruits.remove("banana");
        System.out.println(fruits);

        for(String fruit:fruits){
            System.out.println(fruit);
        }
    }
}
