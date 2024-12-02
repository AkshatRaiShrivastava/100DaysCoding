import java.util.Stack;

public class infixToPostfix {
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g+h)-i";
        // convert from infix to postfix
        infixToPostfixConversion(exp);
    }

    public static int priority(char c) {
        if (c == '^') {
            return 3;
        } else if (c == '*' || c == '/') {
            return 2;
        } else if (c == '+' || c == '-') {
            return 1;
        } else {
            return -1;
        }
    }

    static void infixToPostfixConversion(String str) {
        Stack<Character> st = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= 0 && c <= 9)) {
                postfix.append(c);
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                while (st.peek() != '(') {
                    postfix.append(st.pop());
                }
                st.pop();
            } else {
                while (!st.isEmpty() && priority(c) <= priority(st.peek())) {
                    postfix.append(st.pop());

                }
                st.push(c);
            }
        }
        while (!st.isEmpty()) {
            postfix.append(st.pop());
        }
        System.out.println(postfix.toString());
    }
}
