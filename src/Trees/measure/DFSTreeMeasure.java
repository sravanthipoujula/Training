package Trees.measure;

//            1
//          /  \
//         /    \
//        2      3
//      /  \
//     /    \
//    4      5
public class DFSTreeMeasure {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data =  data;
        }
    }
    Node root;

    public static int calcTreeSize(Node root){
        if(root == null){
            return 0;
        }else{
            return calcTreeSize(root.left)+calcTreeSize(root.right)+1;
        }
    }

    public static int calcTreeHeight(Node root){
        if(root == null){
            return 0;
        }else{
            int leftHeight = calcTreeHeight(root.left);
            int rightHeight = calcTreeHeight(root.right);

            return ((leftHeight > rightHeight ) ? leftHeight : rightHeight) + 1;

        }
    }
    public static void main(String[] args){
        Node binaryTree = new Node(1);
        binaryTree.left = new Node(2);
        binaryTree.left.left = new Node (4);
        binaryTree.left.right = new Node(5);
        binaryTree.right = new Node(3);

        System.out.println("Size :: " + calcTreeSize(binaryTree));

        System.out.println("Height :: " + calcTreeHeight(binaryTree));
    }
}
