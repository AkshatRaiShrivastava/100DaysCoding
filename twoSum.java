public class twoSum {
    public static void main(String[] args) {
        int target = -4;
        int[] arr = { 2, -7, 8, 1, 2, 5, -9 };
        System.out.println(checkSum(target, arr));
    }

    public static boolean checkSum(int target, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j)
                    break;
                else if (arr[i] + arr[j] == target) {
                    return true;
                }   
            }
        }
        return false;
    }
}
