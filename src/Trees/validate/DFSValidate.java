package Trees.validate;

//            1
//          /  \
//         /    \
//        2      3
//      /  \
//     /    \
//    4      5

public class DFSValidate {
    Node root;

    public boolean isBST(Node root, int min, int max){
        if(root == null)
            return true;

        if(min < root.data  && root.data <max){
            return isBST(root.left, min, root.data) && isBST(root.right,root.data ,max);
        }

        return false;
    }
    public static void main(String[] args){
        DFSValidate tree = new DFSValidate();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("is BST :: " + tree.isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

}

class Node{
    int data;
    Node left;
    Node right;
    Node (int data){
        this.data = data;
    }
}