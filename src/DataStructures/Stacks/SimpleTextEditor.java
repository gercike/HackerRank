package DataStructures.Stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SimpleTextEditor {

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader scanner = new BufferedReader(inputStreamReader);
        int numberOfOperations = Integer.parseInt(scanner.readLine());
        Stack<String> states = new Stack<>();
        String letters = "";
        for (int i = 0; i < numberOfOperations; i++) {
            String line = scanner.readLine();
            String[] operations = line.split(" ");
            if (operations[0].equals("1")) {
                states.push(letters);
                letters = letters.concat(operations[1]);
                continue;
            }
            if (operations[0].equals("2")) {
                states.push(letters);
                letters = letters.substring(0, letters.length() - Integer.parseInt(operations[1]));
                continue;
            }
            if (operations[0].equals("3")) {
                System.out.println(letters.charAt(Integer.parseInt(operations[1]) - 1));
                continue;
            }
            if (operations[0].equals("4")) {
                letters = states.pop();
            }
        }
    }
}

/*
1. append - Append string  to the end of .
2. delete - Delete the last  characters of .
3. print - Print the  character of .
4. undo - Undo the last (not previously undone) operation of type 1 or 2, reverting  to the state it was in prior to that operation.
 */