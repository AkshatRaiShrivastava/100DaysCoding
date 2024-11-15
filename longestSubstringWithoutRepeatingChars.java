public class longestSubstringWithoutRepeatingChars {

    public static int longestStr(String str){
        int counter = 0;
        int n = str.length();
        for (int i = 0; i <= n-1; i++) {

            boolean [] visited = new boolean[256];

            for (int j = i; j < n; j++) {
                if (visited[str.charAt(j)]) {
                    break;
                }
                else{
                   counter = Math.max(counter, j-i+1);
                   visited[str.charAt(j)] = true; 
                }
            }
           
        }
        return counter;
    }
    public static void main(String[] args) {
        String str = "ABCBC";
        int res = longestStr(str);
        System.out.println(res);
    }
}
