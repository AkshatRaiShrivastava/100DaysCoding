import java.util.Stack;

public class reverseWords {
    public static String reverse(String str) {
        int n = str.length();
        int count = 0;
        String res = "";
        Stack<String> words = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '.') {
                words.push(res);
                count++;
                res = "";
            } else {
                res = res + str.charAt(i);
            }
        }
        words.push(res);
        // giving output string
        String result = "";
        for (int i = 0; i <= count; i++) {
            if (i == count) {
                result = result + words.pop();
            } else {
                result = result + words.pop() + '.';
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "hello.world.fuck";
        System.out.println(reverse(str));
    }
}
