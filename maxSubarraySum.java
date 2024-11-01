public class maxSubarraySum {
    public static int max(int arr[]) {
        int max = arr[0];
        int sum = 0;
        for( int i=0 ; i<arr.length; i++) {
            sum+=arr[i];
            max = Math.max(max,sum);
            if(sum<0) {
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {-2,-4};
        System.out.println(max(arr));
    }
}
