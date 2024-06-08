package Stack;

import java.util.Stack;

public class PrevSmall {

    public static void prevSmallest(int[] arr, int size){
        Stack<Integer>s=new Stack<>();
        s.add(arr[0]);
        System.out.print("- ");

        for(int i=1; i<size; i++){
            while(!s.isEmpty() && s.peek()>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                System.out.print("- ");
            }
            else
                System.out.print(s.peek()+" ");
            s.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]={30,50,20,15,25};
        prevSmallest(arr, arr.length);
    }
}
