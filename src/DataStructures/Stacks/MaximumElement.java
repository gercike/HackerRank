package DataStructures.Stacks;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.util.stream.Collectors.joining;

public class MaximumElement {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Gercike\\IdeaProjects\\HackerRank\\files\\MaximumElementCase\\testcase#0.txt");
        Scanner scanner = new Scanner(file);
        List<String> ops = new ArrayList<>();
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            ops.add(scanner.nextLine());
        }
        List<Integer> res = MaximumElement.getMax2(ops);
        System.out.println(
                res.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );
    }

    public static List<Integer> getMax(List<String> operations) {
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (String operation : operations) {
            String[] array = operation.split(" ");
            int op = Integer.parseInt(array[0]);
            if (op == 1) {                                      // Push the element x into the stack.
                int number = Integer.parseInt(array[1]);
                stack.push(number);
                treeMap.putIfAbsent(number, 0);
                treeMap.put(number, treeMap.get(number) + 1);
            }
            if (Integer.parseInt(array[0]) == 2) {              //Delete the element present at the top of the stack.
                int numberToDelete = stack.pop();
                treeMap.put(numberToDelete, treeMap.get(numberToDelete) - 1);
                if (treeMap.get(numberToDelete) == 0) {
                    treeMap.remove(numberToDelete);
                }
            }
            if (Integer.parseInt(array[0]) == 3) {              //Print the maximum element in the stack.
                result.add(treeMap.lastKey());
            }
        }
        return result;
    }

    public static List<Integer> getMax2(List<String> operations) {
        class StackElement {
            int value;
            int maxInStack;

            public StackElement(int value, int maxInStack) {
                this.value = value;
                this.maxInStack = maxInStack;
            }
        }
        List<Integer> result = new ArrayList<>();
        Stack<StackElement> stack = new Stack<>();
        int max = Integer.MIN_VALUE;
        for (String operation : operations) {
            String[] array = operation.split(" ");
            int op = Integer.parseInt(array[0]);
            if (op == 1) {
                int number = Integer.parseInt(array[1]);
                if (number > max) {
                    max = number;
                }
                StackElement stackElement = new StackElement(number, max);
                stack.push(stackElement);
            }
            if (op == 2) {
                stack.pop();
                if (!stack.empty()) {
                    max = stack.peek().maxInStack;
                } else {
                    max = Integer.MIN_VALUE;
                }
            }
            if (op == 3) {
                result.add((stack.peek().maxInStack));
            }
        }
        return result;
    }
}
