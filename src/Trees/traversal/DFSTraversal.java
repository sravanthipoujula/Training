package Trees.traversal;

//            1
//          /  \
//         /    \
//        2      3
//      /  \
//     /    \
//    4      5
//(a) Inorder (Left, Root, Right) : 4 2 5 1 3
//        (b) Preorder (Root, Left, Right) : 1 2 4 5 3
//        (c) Postorder (Left, Right, Root) : 4 5 2 3 1
public class DFSTraversal {

    static class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }

    }
    Node root;
    static void preOrderTraverse(Node binaryTree){
        if(binaryTree == null){
            return;
        }
        System.out.print(binaryTree.value + ", ");
        preOrderTraverse(binaryTree.left);
        preOrderTraverse(binaryTree.right);

    }

    static void inOrderTraverse(Node binaryTree){
        if(binaryTree == null){
            return;
        }
        inOrderTraverse(binaryTree.left);
        System.out.print(binaryTree.value + ", ");
        inOrderTraverse(binaryTree.right);

    }

    static void postOrderTraverse(Node binaryTree){
        if(binaryTree == null){
            return;
        }
        postOrderTraverse(binaryTree.left);
        postOrderTraverse(binaryTree.right);
        System.out.print(binaryTree.value + ", ");

    }

    public static void main(String[] args){
        Node binaryTree = new Node(1);
        binaryTree.left = new Node(2);
        binaryTree.left.left = new Node (4);
        binaryTree.left.right = new Node(5);
        binaryTree.right = new Node(3);

        preOrderTraverse(binaryTree);
        System.out.println("\n");
        inOrderTraverse(binaryTree);
        System.out.println("\n");
        postOrderTraverse(binaryTree);

    }
}
