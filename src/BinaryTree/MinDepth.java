package BinaryTree;

public class MinDepth {

    static class Node{

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }


    static int minDepth(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        if(root.right == null){
            return 1+ minDepth(root.left);
        }
        if(root.left == null){
            return 1+ minDepth(root.right);
        }
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }


    public static void main(String[] args) {

        Node n= new Node(10);
        n.left=new Node(5);
//        n.right=new Node(15);
//        n.right.right = new Node(20);
        n.left.left=new Node(3);
        n.left.left.right= new Node(4);
        System.out.println(minDepth(n));

    }
}
