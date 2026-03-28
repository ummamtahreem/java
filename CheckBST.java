class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}
public class CheckBST {
    static Node prev = null; 
    boolean isBST(Node root) {
        if (root == null)
            return true;
        if (!isBST(root.left))
            return false;
        if (prev != null && root.data <= prev.data)
            return false;
        prev = root;
        return isBST(root.right);
    }
    public static void main(String[] args) {
        CheckBST tree = new CheckBST();
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);
        if (tree.isBST(root))
            System.out.println("The given tree is a valid BST.");
        else
            System.out.println("The given tree is NOT a valid BST.");
    }
}
