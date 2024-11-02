public class searchInRotatedAndSortedArray {
    //using linear search
    public static int findElement(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    //using binary search
    public static int findElementBin(int[] arr, int target){
        int low = 0, high = arr.length-1;
        while (low<=high) {
            int mid = low + (high-low)/2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2};
        int target = 6;
        System.out.println(findElementBin(arr,target));
    }
}
