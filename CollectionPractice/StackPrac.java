package CollectionPractice;

import java.util.Stack;

public class StackPrac {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Stack is: "+ st);

        st.pop();
        st.pop();
        System.out.println("New Stack is: "+st);
        System.out.println("Top element of the stack: "+st.peek());
        System.out.println("position of 10: "+st.search(10));
    }
}
