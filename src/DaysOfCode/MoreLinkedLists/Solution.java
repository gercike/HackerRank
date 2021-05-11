package DaysOfCode.MoreLinkedLists;

import java.io.*;
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

    public static Node removeDuplicates(Node head) {
        //Write your code here
        if (head.next == null) {
            return head;
        }
        if (head.data == head.next.data) {
            Node newNode = new Node(head.next.data);
            if (head.next.next!=null) {
                newNode.next = head.next.next;
                return removeDuplicates(newNode);
            } else {
                newNode.next = null;
                return newNode;
            }
        } else {
            head.next = removeDuplicates(head.next);
            return head;
        }
    }

    public static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            Node start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;
        }
        return head;
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
//        Scanner sc = new Scanner(new File("src/HackerRank/DaysOfCode/MoreLinkedLists/nums.txt"));
        Scanner sc = new Scanner(new File("src/HackerRank/DaysOfCode/MoreLinkedLists/tc4.txt"));

        Node head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);
    }
}