public class minimumInSortedAndRotatedArray {
    public static int findMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        int res = arr[0];

        for(int i=1;i<arr.length;i++){
            if (arr[i-1]>arr[i]) {
                int temp = min;
                min = max;
                max = temp;
            }
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
            res = Math.min(res, min);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {10,9,8,4,5,6,7};
        System.out.println(findMin(arr));
    }
}
