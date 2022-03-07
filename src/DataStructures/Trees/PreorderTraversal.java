package DataStructures.Trees;


public class PreorderTraversal {

    private class Node {
        int data;
        Node left;
        Node right;

        public Node() {
        }
    }
    public void main(String[] args) {
        Node node1 = new Node();
        node1.data = 3;
//        node1.left = new Node();
        node1.right = new Node();
//        node1.left.data = 5;
        node1.right.data = 2;
        preOrder(node1);
    }
    public static void preOrder(Node root) {
        System.out.print(root.data + " ");
        if (root.left != null) {
            preOrder(root.left);
        }
        if (root.right != null) {
            preOrder(root.right);
        }
    }
}
