public class booleanMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 0, 0, 1 },
                { 0, 0, 0 },
                { 1, 0, 0 } };
        solveMatrix(matrix);

    }

    public static void solveMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    int ind = i - 1;
                    while (ind >= 0) {
                        if (matrix[ind][j] != 1) {
                            matrix[ind][j] = -1;
                        }
                        ind--;
                    }
                    ind = i + 1;
                    while (ind < matrix.length) {
                        if (matrix[ind][j] != 1) {
                            matrix[ind][j] = -1;
                        }
                        ind++;
                    }
                    ind = j - 1;
                    while (ind >= 0) {
                        if (matrix[i][ind] != 1) {
                            matrix[i][ind] = -1;
                        }
                        ind--;
                    }
                    ind = j + 1;
                    while (ind < matrix.length) {
                        if (matrix[i][ind] != 1) {
                            matrix[i][ind] = -1;
                        }
                        ind++;
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
