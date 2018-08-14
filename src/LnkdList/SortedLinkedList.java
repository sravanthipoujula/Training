package LnkdList;

// 1 <--> 2 <--> 3 <--> null
public class SortedLinkedList {
    LNode head;

    public void add(int data){
        LNode current = head;
        while(current != null){
            if(data >= current.data && data <= current.next.data){
                LNode temp = current.next;
                current.next = new LNode(data);
                current.next.prev = current;
                current.next.next = temp;
                temp.prev = current.next;
                return;
            }
            current = current.next;
        }
    }
    public void printList(){
        LNode temp = head;
        while(temp != null){
            System.out.print( temp.data + " <--> ");
            temp= temp.next;
        }
    }
    public static void main(String[] args){
        SortedLinkedList list = new SortedLinkedList();
        list.head =  new LNode(1);
        list.head.next = new LNode(2);
        list.head.next.prev = list.head;
        list.head.next.next = new LNode(3);
        list.head.next.next.prev = list.head.next;
        list.head.next.next.next = new LNode(5);
        list.head.next.next.next.prev = list.head.next.next;

        list.printList();
        list.add(4);
        list.printList();
    }

}

class LNode{
    int data;
    LNode prev;
    LNode next;

    LNode(int data){
        this.data = data;
        this.prev = next = null;
    }

}

