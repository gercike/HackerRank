package DataStructures.Trees;

import java.util.*;
import java.io.*;

public class LevelOrderTraversal {

    static TreeMap<Integer, Queue<Integer>> levelOrderOfTree = new TreeMap<>();

    public static void levelOrder(Node root) {
        fillTree(root, 0);
        for (Map.Entry<Integer, Queue<Integer>> integerQueueEntry : levelOrderOfTree.entrySet()) {
            for (Integer integer : integerQueueEntry.getValue()) {
                System.out.print(integer + " ");
            }
        }
    }

    static void fillTree(Node node, int verticalLevel) {
        levelOrderOfTree.putIfAbsent(verticalLevel, new LinkedList<>());
        levelOrderOfTree.get(verticalLevel).add(node.data);
        if (node.left != null) {
            fillTree(node.left, verticalLevel + 1);
        }
        if (node.right != null) {
            fillTree(node.right, verticalLevel + 1);
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);
    }
}
