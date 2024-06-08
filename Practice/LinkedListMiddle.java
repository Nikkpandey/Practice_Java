package Practice;
class Node{
    int data;
    Node next;

    Node(int x){
        data=x;
        next=null;
    }
}
public class LinkedListMiddle {
    static Node insertLast(Node head,int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return head;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }

    static Node Middle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    static void display(Node node){
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();
    }
    static int calcSize(Node node){
        int size=0;
        while (node!=null){
            node=node.next;
            size++;
        }
        return size;
    }

    public static void main(String[] args) {
        Node head=null;
        head=insertLast(head,1);
        head=insertLast(head,2);
        head=insertLast(head,3);
        head=insertLast(head,4);
        head=insertLast(head,5);
        head=insertLast(head,6);
        display(head);

        head=Middle(head);
        display(head);
    }
}
