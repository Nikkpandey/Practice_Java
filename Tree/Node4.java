package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Node4 {
    int data;
    Node4 left;
    Node4 right;

    Node4(int value){
        data=value;
        left=right=null;
    }
}

class Tree4{
    Node4 root;

    int treeSize(Node4 root){
       if(root==null){
           return 0;
       }
       else{
           return 1+treeSize(root.left)+treeSize(root.right);
       }
    }

    public static void main(String[] args) {
        Tree4 tree=new Tree4();
        tree.root=new Node4(20);
        tree.root.left=new Node4(30);
        tree.root.right=new Node4(40);
        tree.root.right.left=new Node4(50);
        tree.root.right.right=new Node4(60);
        tree.root.right.left.left=new Node4(70);
        tree.root.right.left.right=new Node4(80);
        tree.root.right.right.left=new Node4(90);
        tree.root.right.right.right=new Node4(100);

        System.out.println("The size of tree is:  "+tree.treeSize(tree.root));
    }
}
