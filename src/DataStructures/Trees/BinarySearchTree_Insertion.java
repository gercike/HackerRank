package DataStructures.Trees;

public class BinarySearchTree_Insertion {

    public static Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        }
        if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }
}
