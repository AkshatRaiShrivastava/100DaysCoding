public class longestPalindromeSubstring {
    public static boolean checkPalindrome(String str, int low, int high) {
        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static String longestPalSubstr(String str) {
        int maxlen = 1, start = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (checkPalindrome(str, i, j) && (j - i + 1) > maxlen) {
                    start = i;
                    maxlen = j - i + 1;
                }
            }
        }
        return str.substring(start, start + maxlen);
    }

    public static void main(String[] args) {
        String str = "rgtwiegeekkeeg";
        System.out.println(longestPalSubstr(str));
    }
}
