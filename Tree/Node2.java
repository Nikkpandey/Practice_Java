package Tree;

public class Node2 {
    int data;
    Node2 left;
    Node2 right;

    Node2(int val){
        data=val;
        left=right=null;
    }
}

class Tree2{
    Node2 root;
    int maxHeight(Node2 node) {
        int height;
        if (node == null) {
            return 0;
        } else {
            int lHeight = maxHeight(node.left);
            int rHeight = maxHeight(node.right);

            if (lHeight > rHeight) {
                height = lHeight + 1;
                return height;
            } else {
                height = rHeight + 1;
                return height;
            }
        }
    }

    public static void main(String[] args) {
        Tree2 tree=new Tree2();
        tree.root=new Node2(20);
        tree.root.left=new Node2(30);
        tree.root.right=new Node2(40);
        tree.root.right.left=new Node2(50);
        tree.root.right.right=new Node2(60);
        tree.root.right.left.left=new Node2(70);
        tree.root.right.left.right=new Node2(80);
        tree.root.right.right.left=new Node2(90);
        tree.root.right.right.right=new Node2(100);

        System.out.println("The size of tree is: "+tree.maxHeight(tree.root));
    }
}
