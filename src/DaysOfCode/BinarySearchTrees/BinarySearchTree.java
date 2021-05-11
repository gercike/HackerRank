package DaysOfCode.BinarySearchTrees;


import java.io.*;
import java.util.*;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinarySearchTree {

    public static int getHeight(Node root) {
        if (root == null) {
            return -1;
        } else {
            int left = 1 + getHeight(root.left);
            int rigth = 1 + getHeight(root.right);
            return Math.max(left, rigth);
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

    public static void main(String args[]) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("src/HackerRank/DaysOfCode/BinarySearchTrees/nodes.txt"));
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}


