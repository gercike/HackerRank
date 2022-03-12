package InterviewPreparationKit.StacksAndQueues;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Queues_ATaleOfTwoStacks {
    static File file = new File("C:\\Users\\Gercike\\IdeaProjects\\HackerRank\\files\\Queues_ATaleOfTwoStacksCases\\testcase#2.txt");

    public static void main(String[] args) throws FileNotFoundException {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        Scanner scan = new Scanner(file);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }

    public static class MyQueue<T> {

        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack 1 x: Enqueue element  into the end of the queue.
            stackNewestOnTop.push(value);
        }

        public T dequeue() { // 2: Dequeue the element at the front of the queue.
            if (stackOldestOnTop.empty()) {
                while (!stackNewestOnTop.empty())
                    stackOldestOnTop.push(stackNewestOnTop.pop());
            }
            return stackOldestOnTop.pop();
        }

        public T peek() { // 3: Print the element at the front of the queue.
            if (stackOldestOnTop.empty()) {
                while (!stackNewestOnTop.empty())
                    stackOldestOnTop.push(stackNewestOnTop.pop());
            }
            return stackOldestOnTop.peek();
        }
    }
}
