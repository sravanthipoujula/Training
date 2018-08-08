package com.macys;

// print linked list === 34 --> 1 --> 24 --> 56 --> 43 --> 12 --> 29 --> Null
// add  122 at first
// add 67 at last
// print linked list === 122 --> 34 --> 1 --> 24 --> 56 --> 43 --> 12 --> 29 --> 9 --> Null
// delete  at first
// delete by value 24
// delete at last
// print linked list === 34 --> 1 --> 56 --> 43 --> 12 --> 29 --> Null



public class LinkedListEx {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }

    }

    Node head;


    public void displayList(Node node){

        if(node == null ){
            System.out.println(" Empty Linked list ");
            return;
        }

        if(node.next == null ){
            System.out.println(node.data + " --> Null");
            return;
        }

        Node current = node;
        while (current.next != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println(current.data + " --> Null");
    }

    public void addFirst(int value){
        if(head == null){
            head = new Node(value);
            return;
        }

        while(head.next != null){
            Node temp = head;
            head = new Node(value);
            head.next = temp;
            return;
        }

    }

    public void addLast(int value){
        if(head == null){
            head = new Node(value);
            return;
        }
        Node temp = head;
        while( temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(value);
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

    public void printLinkedList(){
        if(head == null){
            System.out.println("Empty list");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args){

        Node node = new Node(34);
        node.next = new Node(1);
        node.next.next = new Node(24);
        node.next.next.next = new Node(56);
        node.next.next.next.next = new Node(43);
        node.next.next.next.next.next = new Node(12);
        node.next.next.next.next.next.next = new Node(29);

        LinkedListEx linkedList = new LinkedListEx();
        linkedList.displayList(node);
//        linkedList.head = node;
        linkedList.displayList(linkedList.head);
        linkedList.addFirst(122);
        linkedList.addLast(67);
        linkedList.displayList(linkedList.head);
    }



}
