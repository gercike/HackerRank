package DataStructures.Stacks;

import java.util.*;

public class EqualStacks {

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(3, 2, 1, 1, 1);
        List<Integer> l2 = Arrays.asList(4, 3, 2);
        List<Integer> l3 = Arrays.asList(1, 1, 4, 1);
        System.out.println(equalStacks(l1, l2, l3));
    }

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        StackWithHeight stackWithHeight1 = listIntoStack(h1);
        StackWithHeight stackWithHeight2 = listIntoStack(h2);
        StackWithHeight stackWithHeight3 = listIntoStack(h3);
        int highest = getHighestStackHeight(stackWithHeight1.height, stackWithHeight2.height, stackWithHeight3.height);
        while (stackWithHeight1.height != stackWithHeight2.height || stackWithHeight2.height != stackWithHeight3.height) {
            if (stackWithHeight1.height == highest) {
                stackWithHeight1.height -= stackWithHeight1.stack.pop();
            }
            if (stackWithHeight2.height == highest) {
                stackWithHeight2.height -= stackWithHeight2.stack.pop();
            }
            if (stackWithHeight3.height == highest) {
                stackWithHeight3.height -= stackWithHeight3.stack.pop();
            }
            highest = getHighestStackHeight(stackWithHeight1.height, stackWithHeight2.height, stackWithHeight3.height);
        }
        return highest;
    }

    static int getHighestStackHeight(int h1, int h2, int h3) {
        return Math.max((Math.max(h1, h2)), h3);
    }

    static StackWithHeight listIntoStack(List<Integer> list) {
        Stack<Integer> stack = new Stack<>();
        int height = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            stack.push(list.get(i));
            height += list.get(i);
        }
        return new StackWithHeight(stack, height);
    }

    static class StackWithHeight {
        Stack<Integer> stack;
        int height;

        public StackWithHeight(Stack<Integer> stack, int height) {
            this.stack = stack;
            this.height = height;
        }
    }
}
