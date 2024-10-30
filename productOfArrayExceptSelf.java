public class productOfArrayExceptSelf {
    public static int[] productArray(int[] arr){
        int[] product = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int res=1;
            for(int j=0;j<arr.length;j++){
                res = res*arr[j];
            }
            res = res/arr[i];
            product[i] = res;
        }
        return product;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] product = productArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(product[i]+" ");
        }
    }
}
