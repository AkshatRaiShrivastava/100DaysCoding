public class validParanthesis {
    public static boolean isValid(String str) {
        int n = str.length();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                counter++;
            }
            if (str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']') {
                counter--;
            }
        }
        if (counter == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "[((()))()()]{}";
        if (isValid(str)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
