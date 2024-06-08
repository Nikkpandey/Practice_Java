package LinkedLists;
class Node2{
    int data;
    Node2 next;

    Node2(int x){
        data=x;
        next=null;
    }
}
public class CLinkedListDel {
    static Node2 insertStart(Node2 head,int data){
        Node2 newNode=new Node2(data);
        if(head==null){
            head=newNode;
            head.next=head;
            return head;
        }
        newNode.next=head.next;
        head.next=newNode;

        int temp= head.data;;
        head.data= newNode.data;
        newNode.data=temp;
        return head;
    }

    static Node2 deleteHead(Node2 head){
    if(head==null){
        System.out.println("List is empty.");
        return head;
    }
    if(head.next==head){
        System.out.println("List is now empty.");
        head=null;
        return head;
    }
    head.data=head.next.data;
    head.next=head.next.next;
    return head;
    }

    static Node2 deleteNodePos(Node2 head,int k){
        if(head==null){
            System.out.println("List is empty");
            return head;
        }
        if(k==1){
            deleteHead(head);
            return head;
        }
        Node2 cur=head;
        for(int i=0;i<k-2;i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return head;
    }

    static void display(Node2 node){
        if(node==null){
            return;
        }
        Node2 temp=node;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        while (temp!=node);
        System.out.println();
    }

    public static void main(String[] args) {
        Node2 head=null;
        head=insertStart(head,12);
        head=insertStart(head,13);
        head=insertStart(head,14);
        head=insertStart(head,15);
        head=insertStart(head,16);
        head=insertStart(head,17);
        System.out.println("The list is ");
        display(head);

        head=deleteHead(head);
        System.out.println("The list is ");
        display(head);

        head=deleteNodePos(head,3);
        System.out.println("The list is ");
        display(head);
    }
}
