package LnkdList;

import java.util.HashSet;

public class LoopDetection {
    Node head;
    class Node{
        int data;
        boolean visited;
        Node next;
        Node(int data){
            this.data = data;
            this.visited=false;
        }
    }

    public void buildLinkedList(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    public  void detectLoopWithFlag(){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.visited){
                System.out.println("Found loop @ :: " + temp.data);
                break;
            }
            temp.visited = true;
            temp = temp.next;
        }
    }

    public void detectLoopWithSet(){
        if(head == null){
            return;
        }
        HashSet<Node> set = new HashSet<>();
        Node temp = head;
        while(temp.next != null){
            if(set.contains(temp)){
                System.out.println("Found loop @ :: " + temp.data);
                break;
            }
            set.add(temp);
            temp = temp.next;
        }
    }

    public void detectLoopWithPointers(){
        if(head == null){
            return;
        }
        Node pointer1 = head;
        Node pointer2 = head.next.next;
        while(pointer1.next != null){
            if(pointer1.data == pointer2.data){
                System.out.println("Found loop @ :: " + pointer1.data);
                break;
            }
            System.out.println("pointer1 : " + pointer1.data);
            System.out.println("pointer2 : " + pointer2.data);
            pointer1 = pointer1.next;
            pointer2 = pointer2.next.next;

        }
    }

    public static void main(String[] args){
        LoopDetection list = new LoopDetection();
        list.buildLinkedList(1);
        list.buildLinkedList(2);
        list.buildLinkedList(3);
        list.buildLinkedList(4);
        list.buildLinkedList(5);
//        Node list = new Node(1);
//        list.next = new Node(2);
//        list.next.next = new Node(3);
//        list.next.next.next = new Node(4);
//        list.next.next.next.next = new Node(5);
//        list.next.next.next.next.next = list.next.next;
        Node temp = list.head.next.next.next.next;
        System.out.println(temp.data);
        list.head.next.next.next.next = list.head.next.next;
        list.detectLoopWithFlag();
        list.detectLoopWithSet();
        list.detectLoopWithPointers();

    }
}
