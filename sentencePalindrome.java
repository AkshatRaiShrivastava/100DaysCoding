import java.util.Stack;

public class sentencePalindrome {
    public static boolean isPalindrome(String str){
        Stack<Character> sentence = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == ',' || str.charAt(i) == '.') {
                continue;
            }
            sentence.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == ',' || str.charAt(i) == '.') {
                continue;
            }
            if (str.charAt(i) != sentence.pop()) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal, Panama";
        System.out.println(isPalindrome(str.toLowerCase()));
    }
}
