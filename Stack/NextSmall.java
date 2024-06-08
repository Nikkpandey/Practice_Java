package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextSmall {

    public static ArrayList<String> nextSmallest(int[] arr, int size){
        ArrayList<String> list=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        s.add(arr[size-1]);
        list.add("-");

        for(int i=size-2; i>=0; i--){
            while(!s.isEmpty() && s.peek()>=arr[i]){
                s.pop();
            }
            String result=s.isEmpty()?"-":Integer.toString(s.peek());
            list.add(result);
            s.add(arr[i]);
        }
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        int[] arr={30,50,20,15,25};
        for(String x: nextSmallest(arr, arr.length)){
            System.out.print(x+" ");
        }
    }
}
