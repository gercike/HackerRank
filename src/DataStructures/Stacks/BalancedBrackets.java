package DataStructures.Stacks;

import java.util.Stack;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (s.charAt(i) == ')') {
                    if (stack.empty() || stack.pop() != '(') {
                        return "NO";
                    }
                }
                if (s.charAt(i) == ']') {
                    if (stack.empty() || stack.pop() != '[') {
                        return "NO";
                    }
                }
                if (s.charAt(i) == '}') {
                    if (stack.empty() || stack.pop() != '{') {
                        return "NO";
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            return "YES";
        }
        return "NO";
    }
}
