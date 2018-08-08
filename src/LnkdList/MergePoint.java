package LnkdList;
//finding merge point of two lists
//   1 --> 2 --> 3
//                \
//                 \
//                  4 --> 5
//                 /
//                /
//               6


public class MergePoint {
    static class Node{
        int data;
        boolean visited;
        Node next;
        Node(int data){
            this.data = data;
            this.visited =false;
        }
    }
    Node head1;
    Node head2;
    public void printLists(){
        if(head1 == null || head2 == null){
            return;
        }
        Node temp1 = head1;
        while(temp1 != null){
            System.out.print(temp1.data + "-->");
            temp1 = temp1.next;
        }
        System.out.println();
        Node temp2 = head2;
        while(temp2 != null){
            System.out.print(temp2.data + "-->");
            temp2 = temp2.next;
        }
    }

    public void findMergePoint(){
        if(head1 == null || head2 == null){
            return;
        }

        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1.next != null){
            if(temp1.visited || temp2.visited){
                System.out.println("Found merge point @ " + temp1.data + "or" + temp2.data);
                return;
            }
            temp1.visited = true;
            temp2.visited = true;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

    }

    public static void main(String[] args){
        MergePoint list = new MergePoint();
        list.head1 = new Node(1);
        list.head1.next = new Node(2);
        list.head1.next.next = new Node(3);
        list.head1.next.next.next = new Node(4);
        list.head1.next.next.next.next = new Node(5);

        list.head2 = new Node(6);
        list.head2.next = list.head1.next.next.next;

        list.printLists();
        list.findMergePoint();
    }
}
