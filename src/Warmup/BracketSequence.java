package Warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BracketSequence {
    public static void main(String[] args) throws IOException {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('{', '}');
        brackets.put('[', ']');
        brackets.put('(', ')');

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String seq = br.readLine();

        System.out.println(isSequenceCorrect(seq, brackets));
    }

    public static String isSequenceCorrect(String sequence, Map<Character, Character> brackets) {
        int len = sequence.length();

        if (len == 0) {
            return "yes";
        }

        if (len % 2 == 1) {
            return "no";
        }

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < sequence.length(); ++i) {
            char c = sequence.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.add(c);
                continue;
            }

            if (stack.size() == 0 || brackets.get(stack.removeLast()) != c) {
                return "no";
            }
        }

        if (stack.size() != 0) {
            return "no";
        }

        return "yes";
    }
}
