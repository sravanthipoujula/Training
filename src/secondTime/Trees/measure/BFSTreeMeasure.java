package secondTime.Trees.measure;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTreeMeasure {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static int calcTreeSize(Node root){
        if(root ==null){
            return 0;
        }
        int count = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node tempNode = q.poll();
            count++;
            if(tempNode.left != null){
                q.add(tempNode.left);
            }
            if(tempNode.right != null){
                q.add(tempNode.right);
            }
        }
        return count;
    }

    public static int calcHeight(Node root){
        if (root == null) {
            return 0;
        }
        Queue<Node> q =  new LinkedList<>();
        q.add(root);
        int height = 1;
        while (!q.isEmpty()){
            Node tempNode = q.poll();
            if(tempNode.left != null){
                q.add(tempNode.left);
            }
            if(tempNode.right != null){
                q.add(tempNode.right);
            }
        }
        return height;
    }

    public static void main(String[] args){
        Node bt = new Node(1);
        bt.left = new Node(2);
        bt.right = new Node(3);
        bt.right.left = new Node(6);
        bt.left.left = new Node(4);
        bt.left.left.left = new Node(5);
//        bt.left.right = new Node(5);

        System.out.println("Size of the Tree :: " +calcTreeSize(bt));
        System.out.println("Height/MaxDepth of the Tree :: " +calcHeight(bt));
    }
}
