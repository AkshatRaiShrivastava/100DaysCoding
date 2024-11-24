public class checkAnagram {
    public static boolean checkString(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        if (n != m) {
            return false;
        }
        boolean[] res = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    res[i] = true;
                }
            }
        }

        for (boolean b : res) {
            if (b == false) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s1 = "lisjten";
        String s2 = "silejnt";
        if(checkString(s1, s2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not anagram");
        }
    }
}
