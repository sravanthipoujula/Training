package practice1;

// print linked list === 34 --> 1 --> 24 --> 56 --> 43 --> 12 --> 29 --> Null
// add  122 at first
// add 67 at last
// print linked list === 122 --> 34 --> 1 --> 24 --> 56 --> 43 --> 12 --> 29 --> 9 --> Null
// delete  at first
// delete by value 24
// delete at last
// print linked list === 34 --> 1 --> 56 --> 43 --> 12 --> 29 --> Null

public class SingleLinkedList {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    Node head;
    public void addFirst(int data){
        if(head == null){
            head = new Node(data);
            head.next =null;
            return;
        }
        Node temp = head;
        head = new Node(data);
        head.next = temp;
    }

    public void addLast(int data){
        if(head == null){
            head = new Node(data);
            head.next =null;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    public void addNextToNode(int existingValue, int dataToAdd){
        if(head == null){
            head = new Node(dataToAdd);
            head.next =null;
            return;
        }
        Node temp = head;
        while(temp.data != existingValue){
            temp= temp.next;
        }
        Node newTemp = temp.next;
        temp.next=new Node(dataToAdd);
        temp.next.next = newTemp;
    }

    public void printList(){
        if(head == null){
            System.out.println(" Empty List");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ==> ");
            temp = temp.next;
        }
    }


    public static void main(String[] args){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addFirst(1);
        singleLinkedList.addFirst(34);
        singleLinkedList.addLast(24);
        singleLinkedList.addNextToNode(24,56);
        singleLinkedList.addNextToNode(56,43);
        singleLinkedList.addLast(12);
        singleLinkedList.addLast(29);

        singleLinkedList.printList();
    }
}
