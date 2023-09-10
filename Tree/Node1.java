package Tree;

public class Node1 {
    int data;
    Node1 left;
    Node1 right;

    Node1(int val){
        data=val;
        left=right=null;
    }
}

class Tree{
    public static void main(String[] args) {
        Node1 root=new Node1(10);
        root.left=new Node1(20);
        root.right=new Node1(30);
        root.right.left=new Node1(40);
        root.right.right=new Node1(50);
        inOrder(root);
    }

    public static void inOrder(Node1 root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
}
