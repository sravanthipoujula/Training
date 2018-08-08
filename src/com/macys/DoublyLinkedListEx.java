package com.macys;

// print linked list === 34 --> 1 --> 24 --> 56 --> 43 --> 12 --> 29 --> Null
// add  122 at first
// add 67 at last
// print linked list === 122 --> 34 --> 1 --> 24 --> 56 --> 43 --> 12 --> 29 --> 9 --> Null
// delete  at first
// delete by value 24
// delete at last
// print linked list === 34 --> 1 --> 56 --> 43 --> 12 --> 29 --> Null
public class DoublyLinkedListEx {

    public static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data = data;
        }


    };

    Node head;

    public void addElement(int data){
        if(head == null){
            head = new Node(data);
            return;
        }

        if(head.next == null){
            Node temp = new Node(data);
            temp.prev = head;
            head.next = temp;
            return;
        }
    }

    public void displayLinkedlist(Node node){
        if(node == null){
            System.out.println("empty linked list");
            return;
        }

        if(node.next == null){
            System.out.println(node.data + "<--> null");
            return;
        }
        Node temp = head;
        while(temp.next != null ){
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println(temp.data + " <--> ");

    }




    public static void main(String[] args){

        DoublyLinkedListEx doublyLinkedList = new DoublyLinkedListEx();

        doublyLinkedList.addElement(34);
        doublyLinkedList.addElement(1);
        doublyLinkedList.displayLinkedlist(doublyLinkedList.head);

    }
}
