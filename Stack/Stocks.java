package Stack;
import java.util.*;
public class Stocks {

    public static void stockSpan(int[] arr,int size){
        Stack<Integer> s=new Stack<>();
        s.add(0);
        System.out.print(1+" ");
        for (int i=1;i<size;i++){
            while(!s.isEmpty() &&arr[s.peek()]<=arr[i]){
                s.pop();
            }
            int span=s.isEmpty()?i+1:i-s.peek();
            System.out.print(span+" ");
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int[] arr={12,10,20,22,15,14,18,32,20,22,19};
        int size= arr.length;
        stockSpan(arr,size);
    }
}
