package secondTime.Trees.traversal;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static void printTreeinBFS(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.data);
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
        }
    }

    public static void main(String[] args){
        Node bt = new Node(1);
        bt.left = new Node(2);
        bt.right = new Node(3);
        bt.left.left =  new Node(4);
        bt.left.right = new Node(5);

        printTreeinBFS(bt);

    }
}
