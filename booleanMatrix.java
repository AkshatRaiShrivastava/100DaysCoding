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
                    int index = i - 1;
                    while (index >= 0) {
                        if (matrix[index][j] != 1) {
                            matrix[index][j] = -1;
                        }
                        index--;
                    }
                    index = i + 1;
                    while (index < matrix.length) {
                        if (matrix[index][j] != 1) {
                            matrix[index][j] = -1;
                        }
                        index++;
                    }
                    index = j - 1;
                    while (index >= 0) {
                        if (matrix[i][index] != 1) {
                            matrix[i][index] = -1;
                        }
                        index--;
                    }
                    index = j + 1;
                    while (index < matrix.length) {
                        if (matrix[i][index] != 1) {
                            matrix[i][index] = -1;
                        }
                        index++;
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
