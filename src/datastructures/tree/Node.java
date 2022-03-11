package datastructures.tree;

public class Node {

    private int key;
    protected Node left,right;

    public Node(int item){
        key=item;
        left=right=null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

class BinaryTree{

    private Node root;

    public BinaryTree(){
        root=null;
    }

    public BinaryTree(int key) {
        root=null;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }

    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.root=new Node(1);
        binaryTree.root.left=new Node(2);
        binaryTree.root.right=new Node(3);

    }
}
