package LnkdList;
//finding merge point of two lists
//   1 --> 2 --> 3
//                \
//                 \
//                  4 --> 5
//                 /
//                /
//               6


import java.util.HashSet;

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

    public void findMergePointWithFlag(){
        if(head1 == null || head2 == null){
            return;
        }
        Node temp1 = head1;
        while(temp1.next != null){
            temp1.visited = true;
            temp1 = temp1.next;
        }
        Node temp2 = head2;
        while(temp2.next != null){
            if(temp2.visited){
                System.out.println("Found merge point @ " + temp2.data);
                return;
            }
            temp2 = temp2.next;
        }
    }

    public void findMergePointWithSet(){
        if(head1 == null || head2 == null){
            return;
        }
        Node temp1 = head1;
        HashSet<Node> set = new HashSet<>();
        while(temp1.next != null){
            set.add(temp1);
            temp1 = temp1.next;
        }

        Node temp2 = head2;
        while(temp2.next != null){
            if(set.contains(temp2)){
                System.out.println("Found merge point @ " + temp2.data);
                return;
            }
            temp2 =  temp2.next;
        }
    }
    public int getCount(Node node){
        Node temp = node;
        int count = 0;
        while (temp != null){
            count ++;
            temp = temp.next;
        }
        return count;
    }
    public void findMergePoint(int count, Node node1, Node node2){
        for(int i=0; i< count; i++){
            node1 = node1.next;
        }
        while (node1 != null && node2 != null){
            if(node1.data == node2.data){
                System.out.println("Found merge point @ "+ node1.data);
                return;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
    }
    public void findMergePointWithMath(){
        if(head1 == null || head2 == null){
            return;
        }
        int count1 = getCount(head1);
        int count2 = getCount(head2);
        if(count1 > count2){
            findMergePoint(count1 - count2,head1, head2);
        }else{
            findMergePoint(count2 - count1,head2,head1);
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
        list.findMergePointWithFlag();
        list.findMergePointWithSet();
        list.findMergePointWithMath();
    }
}
