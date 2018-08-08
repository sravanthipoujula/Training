package Trees.measure;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTreeMeasure {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    Node root;

    static int calcTreeDepth(Node node){
        if(node == null){
            return 0;
        }else{
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(node);
            int height = 0;
            Node base = node;
            while (!queue.isEmpty()){
                Node temp = queue.poll();
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
                if(temp == base){
                    height++;
                    base = temp.left != null ? temp.left : temp.right;

                }
            }
            return height;
        }
    }
    public static void main(String[] args){
        Node binaryTree = new Node(1);
        binaryTree.left = new Node(2);
        binaryTree.left.left = new Node (4);
        binaryTree.left.left.right = new Node (6);
//        binaryTree.left.right = new Node(5);
        binaryTree.right = new Node(3);
        binaryTree.right.right = new Node(6);

        System.out.println(calcTreeDepth(binaryTree));
    }
}
