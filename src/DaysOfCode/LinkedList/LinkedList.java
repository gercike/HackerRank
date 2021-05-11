package DaysOfCode.LinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    public static Node insert(Node head, int data) {
        Node newNode;
        if (head == null) {
            newNode = new Node(data);
            newNode.next = head;
        } else {
            newNode = head;
            head.next = insert(head.next, data);
        }
        return newNode;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("src/HackerRank/LinkedList/nums.txt"));
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }

    public Node getNext(Node node) {
        return node.next;
    }

    public Node addNode(Node nodeHead, Node tail) {
        nodeHead.next = tail;
        return nodeHead;
    }
}