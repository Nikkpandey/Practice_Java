package Queue;
import java.util.*;
public class ReverseQueue {
    static Queue queue;

    public static void reverse(){
        Stack stack=new Stack<>();
        while(!queue.isEmpty()){
            stack.add(queue.peek());
            queue.remove();
        }
        while(!stack.isEmpty()){
            queue.add(stack.peek());
            stack.pop();
        }
    }

    public static void main(String[] args) {
        queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        reverse();
        while(!queue.isEmpty()){
            System.out.print(queue.peek()+" ");
            queue.remove();
        }
    }

}
