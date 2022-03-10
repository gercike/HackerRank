package DataStructures.Stacks;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.util.stream.Collectors.joining;

public class MaximumElement {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Gercike\\IdeaProjects\\HackerRank\\files\\MaximumElementCase\\testcase#5.txt");
        Scanner scanner = new Scanner(file);
        List<String> ops = new ArrayList<>();
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            ops.add(scanner.nextLine());
        }
        List<Integer> res = MaximumElement.getMax(ops);
        System.out.println(
                res.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
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

}
