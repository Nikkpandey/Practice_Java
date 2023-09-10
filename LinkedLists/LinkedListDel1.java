package LinkedLists;
import java.lang.*;
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class LinkedListDel1 {
    static Node insert(Node head, int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        return head;
    }
    static void display(Node node){
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();
    }
    static Node deleteNode(Node head, int delVal){
        Node temp=head;
        Node previous=null;

        if(temp.next==null){
            head=null;
            System.out.println("Value deleted "+delVal);
            return head;
        }
        if(temp!=null && temp.data==delVal){
            head=temp.next;
            System.out.println("Value deleted: "+delVal);
            return head;
        }
        while (temp!=null && temp.data!=delVal){
            previous=temp;
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Value not found.");
            return head;
        }
        previous.next=temp.next;
        System.out.println("Value deleted "+delVal);
        return head;
    }
    public static void main(String[] args) {
        Node head=null;
        head=insert(head,12);
        head=insert(head,16);
        head=insert(head,18);
        head=insert(head,13);
        System.out.println("LinkedList before operation: ");
        display(head);

        head=deleteNode(head,18);
        head=deleteNode(head,16);
        System.out.println("LinkedList after operation: ");
        display(head);
    }
}
