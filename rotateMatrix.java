public class rotateMatrix {
    public static void rotate90(int[][] matrix){
        //transpose the matrix
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reversing the row
        for (int i = 0; i < matrix.length; i++) {
            int start = 0, end = matrix.length-1;
            while (start<end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
        
        // printing the matrix
        for(int[] elements : matrix){
            for (int x : elements) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        rotate90(matrix);
    }
}
