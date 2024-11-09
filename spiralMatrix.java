import java.util.ArrayList;

public class spiralMatrix {
    public static ArrayList<Integer> spiralList(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // setting boundaries
        int top = 0, bottom = matrix[0].length-1,right = matrix.length-1,left = 0;

        while (top<=bottom && left<=right) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if (top<=bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left<=right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
            
            
        }


        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        ArrayList<Integer> result = spiralList(matrix);
        for (int res : result) {
            System.out.print(res + " ");
        }
    }
}
