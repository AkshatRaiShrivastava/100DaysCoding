import java.util.*;

public class buyAndSellStock {
    public static int maxProfit(int[] arr) {
        ArrayList<Integer> tempVal = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    tempVal.add(arr[j] - arr[i]);
                } else {
                    return 0;
                }
            }
        }
        return Collections.max(tempVal);
    }

    public static void main(String[] args) {
        int[] prices = { 1, 3, 6, 9, 11 };
        System.out.println(maxProfit(prices));
    }
}
