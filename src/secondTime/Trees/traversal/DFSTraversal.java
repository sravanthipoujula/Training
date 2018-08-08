package secondTime.Trees.traversal;

//            1
//          /  \
//         /    \
//        2      3
//      /  \
//     /    \
//    4      5
//(a) Inorder (Left, Root, Right) : 4 2 5 1 3
//(b) Preorder (Root, Left, Right) : 1 2 4 5 3
//(c) Postorder (Left, Right, Root) : 4 5 2 3 1

public class DFSTraversal {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static void printInOrder(Node root){
        if(root == null){
            return;
        }

        printInOrder(root.left);
        System.out.print(root.data + ", ");
        printInOrder(root.right);
    }

    public static void printPreOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + ", ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    public static void printPostOrder(Node root){
        if(root == null){
            return;
        }

        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data + ", ");
    }

    public static void main(String[] args){
        Node bt = new Node(1);
        bt.left = new Node(2);
        bt.right = new Node(3);
        bt.left.left =  new Node(4);
        bt.left.right = new Node(5);

        printInOrder(bt);
        System.out.println("");
        printPreOrder(bt);
        System.out.println("");
        printPostOrder(bt);
    }
}
