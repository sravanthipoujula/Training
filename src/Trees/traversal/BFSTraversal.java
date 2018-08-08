package Trees.traversal;

import java.util.LinkedList;
import java.util.Queue;

//            1
//          /  \
//         /    \
//        2      3
//      /  \
//     /    \
//    4      5
//(a) Level Order  : 1 2 3 4 5
public class BFSTraversal {
    static class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
    }
    Node root;
    public static void bfsOrder(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node tempNode = queue.poll();
            System.out.print(tempNode.value + ", ");
            if(tempNode.left != null){
                queue.add(tempNode.left);
            }
            if(tempNode.right != null){
                queue.add(tempNode.right);
            }
        }
    }

    public static void main(String[] args){
        Node binaryTree = new Node(1);
        binaryTree.left = new Node(2);
        binaryTree.left.left = new Node (4);
        binaryTree.left.right = new Node(5);
        binaryTree.right = new Node(3);

        bfsOrder(binaryTree);
    }

}
