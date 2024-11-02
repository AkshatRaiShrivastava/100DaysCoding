
public class maxSubArrayProduct {
    public static int maxProduct(int [] arr){
        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            if (current < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            maxProduct = Math.max(current, current*maxProduct);
            minProduct = Math.min(current, current*minProduct);

            result = Math.max(result, maxProduct);
        }
        return result;
    }
    public static void main(String[] args) {
        int [] arr = {-2,6,-3,-10,0,2};
        System.out.println(maxProduct(arr));
    }
}
