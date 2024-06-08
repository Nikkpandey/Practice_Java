package LinkedLists;
class Node1{
    int data;
    Node1 prev;
    Node1 next;

    Node1(int x){
        data=x;
        next=null;
        prev=null;
    }
}

public class DLinkedLists {
    static Node1 insertStart(Node1 head,int data){
        Node1 newNode=new Node1(data);
        newNode.next=head;
        if(head!=null){
            head.prev=newNode;
        }
        head=newNode;
        return head;
    }

    static Node1 insertLast(Node1 head,int data){
        Node1 newNode=new Node1(data);

        if(head==null){
            head=newNode;
            return head;
        }

        Node1 temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        return head;
    }

    static Node1 insertPosition(int pos,Node1 head,int data){
        int size=calcSize(head);
        if(pos<1 || size<pos){
            System.out.println("Can't insert ,invalid position");
        }
        else {
            Node1 newNode=new Node1(data);
            Node1 temp=head;
            while (--pos>0){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        return head;
    }

    static void display(Node1 node){
        while (node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();
        }
        static int calcSize(Node1 node){
        int size=0;
        while (node!=null){
            node=node.next;
            size++;
        }
        return size;
        }

    public static void main(String[] args) {
       Node1 head=null;
        head=insertStart(head,23);
        head=insertStart(head,21);
        head=insertStart(head,18);
        head=insertStart(head,12);
        System.out.println("Doubly linkedList from start: ");
        display(head);

//        head=insertLast(head,45);
//        head=insertLast(head,32);
//        head=insertLast(head,52);
//        System.out.println("Doubly linkedList from end: ");
//        display(head);
//

        head=insertPosition(2,head,23);
        head=insertPosition(1,head,7);
        head=insertPosition(3,head,5);
        System.out.println("Doubly linkedList at position: ");
        display(head);
    }
}
