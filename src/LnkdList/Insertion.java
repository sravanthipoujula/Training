package LnkdList;

// 1 --> 24 --> 56 --> 29 --> Null
public class Insertion {
    Node head;

    public void insertAt(int data, int pos){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node temp = head;
        int count = 1;
        while (temp != null){
            if(count == pos){
                Node backUp =  temp.next;
                temp.next = new Node(data);
                temp.next.next = backUp;
                return;
            }
            temp = temp.next;
            count++;
        }
    }

    public void printLinkedList(){
        if(head == null){
            System.out.println("Empty List");
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "-->");
            temp =  temp.next;
        }
    }

    public static void main(String[] args){
        Insertion i = new Insertion();
        i.head = new Node(1);
        i.head.next = new Node(24);
        i.head.next.next = new Node(56);
        i.head.next.next.next = new Node(29);

        i.insertAt(2, 3);
        i.printLinkedList();

    }

}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
