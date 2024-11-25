import java.util.Arrays;

public class longestCommonPrefix {
    public static String longestPrefix(String[] strs) {
        Arrays.sort(strs);
        String res = "";
        int counter = 0;
        String first = strs[0];
        String last = strs[strs.length - 1];
        int minLength = Math.min(first.length(), last.length());
        while (counter < minLength && first.charAt(counter) == last.charAt(counter)) {
            res = res + strs[0].charAt(counter);
            counter++;
        }
        if (res.isEmpty()) {
            return "-1";
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strs = { "hello", "world"};
        System.out.println(longestPrefix(strs));
    }
}
