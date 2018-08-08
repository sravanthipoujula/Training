package secondTime.Trees.measure;

public class DFSTreeMeasure {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static int calcSize(Node root){
        if(root == null){
            return 0;
        }
        int leftSize = calcSize(root.left);
        int rightSize = calcSize(root.right);
        return leftSize+rightSize+1;
    }

    public static int calcHeight(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = calcHeight(root.left);
        int rightHeight = calcHeight(root.right);
        return ((leftHeight > rightHeight ) ? leftHeight :rightHeight) + 1;
    }

    public static int minDepth(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = minDepth(root.left);
        int rightHeight = minDepth(root.right);
        return ((leftHeight > rightHeight ) ? rightHeight :leftHeight) + 1;
    }


    public static void main(String[] args){
        Node bt = new Node(1);
        bt.left = new Node(2);
        bt.right = new Node(3);
        bt.left.left = new Node(4);
        bt.left.right = new Node(5);

        System.out.println("Size of the Tree ::" + calcSize(bt));
        System.out.println("Height/Maxdepth of the Tree ::" + calcHeight(bt));
        System.out.println("Min depth of the Tree ::" + minDepth(bt));
    }
}
