package DataStructures.Trees;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class TopView {
    static TreeMap<Integer, NodeWithPosition> map = new TreeMap<>();

//    public static void main(String[] args) {
//        topView(egyKetto());
////        Node tiz = new Node();
//    }

    public static void topView(Node root) {
        int horizontalPosition = 0;//x
        int verticalPosition = 0;//y
        fillMap(root, horizontalPosition, verticalPosition);
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, NodeWithPosition> integerNodeWithPositionEntry : map.entrySet()) {
//            System.out.print(integerNodeWithPositionEntry.getValue().value + " ");
            list.add(integerNodeWithPositionEntry.getValue().value);
        }
        System.out.println(list);
    }

    static void fillMap(Node node, int horizontalPosition, int verticalPosition) {
        NodeWithPosition nodeWithPosition = new NodeWithPosition(node.data, horizontalPosition, verticalPosition);
        if (map.containsKey(horizontalPosition)) {
            if (map.get(horizontalPosition).vertical < nodeWithPosition.vertical) {
                map.put(horizontalPosition, nodeWithPosition);
            }
        } else {
            map.put(horizontalPosition, nodeWithPosition);
        }
        if (node.left != null) {
            fillMap(node.left, horizontalPosition - 1, verticalPosition - 1);
        }
        if (node.right != null) {
            fillMap(node.right, horizontalPosition + 1, verticalPosition - 1);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Gercike\\IdeaProjects\\HackerRank\\files\\Trees\\TopViewCase#1.txt");
        Scanner scan = new Scanner(file);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
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

    static Node egyKetto() {
        Node negy = new Node(4);
        Node harom = new Node(3);
        harom.right = negy;
        Node hat = new Node(6);
        Node ot = new Node(5);
        ot.left = harom;
        ot.right = hat;
        Node ketto = new Node(2);
        ketto.right = ot;
        Node egy = new Node(1);
        egy.right = ketto;
        return egy;
    }

    static class NodeWithPosition {
        int value;
        int horizontal;
        int vertical;

        public NodeWithPosition(int value, int horizontal, int vertical) {
            this.value = value;
            this.horizontal = horizontal;
            this.vertical = vertical;
        }
    }

    static Node tizHusz() {
        Node negyven = new Node(40);
        Node hatvan = new Node(60);
        Node kilencven = new Node(90);
        Node szasz = new Node(100);
        Node husz = new Node(20);
        Node harminc = new Node(30);
        Node tiz = new Node(10);
        husz.left = negyven;
        husz.right = hatvan;
        harminc.left = kilencven;
        harminc.right = szasz;
        tiz.left = husz;
        tiz.right = harminc;
        return tiz;
    }

    private static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}
