public class trappingRainWater {
    public static int rainWater(int[] arr) {
        int res = 0;
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        left[0] = arr[0];
        right[arr.length-1] = arr[arr.length-1];
        
        // for left array
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(left[i-1], arr[i]);
        }
       
        // for right array
        for (int i = arr.length - 2; i >= 0; i--) {
           right[i] = Math.max(right[i+1], arr[i]);
        }
        
        for (int i = 1; i < arr.length-1; i++) {
            int minOf2 = Math.min(left[i-1], right[i+1]);
            if (minOf2 > arr[i]) {
                res += minOf2-arr[i];
            }
        }
        return res;
    }
    public static int rainWaterBrute(int [] arr){
        int res = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(arr[j], left);
            }
            int right = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                right = Math.max(arr[j], right);
            }

            res += Math.min(left, right) - arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 0, 1, 0, 4, 0, 2 };
        // System.out.println(rainWater(arr));
        System.out.println(rainWater(arr));
    }
}
