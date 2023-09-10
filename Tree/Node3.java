package Tree;

public class Node3 {
    int data;
    Node3 left;
    Node3 right;

    Node3(int val){
        data=val;
        left=right=null;
    }
}

class Tree3{
    Node3 root;
    void printKDist(Node3 node,int k){
        if(node==null){
            return;
        }
        if(k==0){
            System.out.print(node.data+" ");
        }
        else{
            printKDist(node.left,k-1);
            printKDist(node.right,k-1);
        }
    }

    public static void main(String[] args) {
        Tree3 tree=new Tree3();
        tree.root=new Node3(20);
        tree.root.left=new Node3(30);
        tree.root.right=new Node3(40);
        tree.root.right.left=new Node3(50);
        tree.root.right.right=new Node3(60);
        tree.root.right.left.left=new Node3(70);
        tree.root.right.left.right=new Node3(80);
        tree.root.right.right.left=new Node3(90);
        tree.root.right.right.right=new Node3(100);

        int k=3;
        System.out.println("The nodes at distance "+k+" are: ");
        tree.printKDist(tree.root,k);

    }
}
