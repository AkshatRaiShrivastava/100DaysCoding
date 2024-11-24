public class maxCharConsecutive {
    public static char maxChar(String str) {
        int n = str.length();
        char res = str.charAt(0);
        int count = 0;
        for (int i = 0; i < n; i++) {
            int curr_counter = 1;
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) != str.charAt(j)) {
                    break;
                }
                curr_counter++;
            }
            if (curr_counter > count) {
                count = curr_counter;
                res = str.charAt(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "geeekk";
        System.out.println(maxChar(str));
    }
}
