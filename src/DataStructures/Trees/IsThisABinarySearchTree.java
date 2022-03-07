package DataStructures.Trees;

import DataStructures.Trees.Node;

public class IsThisABinarySearchTree {

    boolean checkBST(Node root) {
        return checkBSTWithMinMax(root, 0, Integer.MAX_VALUE);
    }

    boolean checkBSTWithMinMax(Node root, int min, int max) {
        if (!(root.data > min && root.data < max)) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        boolean left = false;
        boolean right = false;
        if (root.left != null) {
            left = checkBSTWithMinMax(root.left, min, root.data);
        }
        if (root.right != null) {
            right = checkBSTWithMinMax(root.right, root.data, max);
        }
        return left && right;
    }
}
