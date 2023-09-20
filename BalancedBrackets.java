import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanced(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i ++) {
            if (string.charAt(i) == '(') {
                count ++;
            }
            else if (string.charAt(i) == ')') {
                count --;
            }
        }
        return count == 0;
    }
    //This is a reworked solution from a similar coding challenge from foundations. It ended up being very similar to the provided solution. Runtime of O(n)

    public static boolean isBalancedToo(String string) {
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> bracketPairs = new HashMap<Character, Character>();
        bracketPairs.put(')', '(');
        bracketPairs.put(']', '[');
        bracketPairs.put('}', '{');
        bracketPairs.put('>', '<');
        for (int i = 0; i < string.length(); i ++) {
            if (bracketPairs.containsValue(string.charAt(i))) {
                stack.push(string.charAt(i));
            }
            else if (bracketPairs.containsKey(string.charAt(i))) {
                if (stack.isEmpty()) {
                    return false;
                }
                Character mostRecentBracket = stack.pop();
                if (!mostRecentBracket.equals(bracketPairs.get(string.charAt(i)))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    //I got stuck at this point and needed additional help, so much of this solution is modeled after the provided solution. Runtime (I think) of O(n)
}
