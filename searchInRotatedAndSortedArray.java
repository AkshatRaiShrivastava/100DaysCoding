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
            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target<arr[mid]) {
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                }
                else{
                    high = mid -1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {6,1,2,3,4,5};
        int target = 6;
        System.out.println(findElementBin(arr,target));
    }
}
