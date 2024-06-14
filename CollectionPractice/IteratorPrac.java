package CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorPrac {
    public static void main(String[] args) {
        List<Integer> newList=new ArrayList<>();
        newList.add(100);
        newList.add(20);
        newList.add(12);
        newList.add(41);
        newList.add(15);

        Collections.sort(newList);
        Iterator it=newList.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
