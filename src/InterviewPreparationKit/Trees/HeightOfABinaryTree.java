package InterviewPreparationKit.Trees;

class Node {
    int data;
    Node left;
    Node right;
}

public class HeightOfABinaryTree {
    public static int height(Node root) {
        // Write your code here.
        int height = 0;
        int heightLeft = 0;
        int heightRight = 0;
        if (root.left == null && root.right == null) {
            return height;
        }
        if (root.left != null) {
            heightLeft++;
            heightLeft += height(root.left);
        }
        if (root.right != null) {
            heightRight++;
            heightRight += height(root.right);
        }
        return Math.max(heightLeft, heightRight);
    }
}
