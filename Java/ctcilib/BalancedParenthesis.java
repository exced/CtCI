package ctcilib;

import java.util.Stack;
import java.util.List;
import java.util.Arrays;

public class BalancedParenthesis {

    private static final Character[][] MATCHING_TOKENS = {{'{','}'}, {'[',']'}, {'(',')'}};
    
    private static boolean isOpeningTerm(Character c) {
        for (Character[] arr : MATCHING_TOKENS) {
            if (c == arr[0]) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean matchTerms(Character opening, Character closing) {
        for (Character[] arr : MATCHING_TOKENS) {
            if (opening == arr[0]) {
                return closing == arr[1];
            }
        }
        return false;
    }

    public static boolean checkParenthesis(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (Character c : str.toCharArray()) {
            if (isOpeningTerm(c)) {
                stack.push(c);
            } else {
                if (!stack.isEmpty() && !matchTerms(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("{{}}", "{]}", "[][]{()}");
        for (String str : list) {
            System.out.println("isMatching : " + str + " ? " + checkParenthesis(str));
        }
    }

}