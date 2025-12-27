// // multiply two matrices
// public class Matrices {
//     public static void main(String[] args) {
//         int[][] matrixA = {
//                 { 1, 2 },
//                 { 3, 4 }
//         };

//         int[][] matrixB = {
//                 { 1, 2, 4 },
//                 { 6, 8, 9 }

//         };

//         int[][] result = multiplyMatrices(matrixA, matrixB);

      
//         for (int i = 0; i < result.length; i++) {
//             for (int j = 0; j < result[0].length; j++) {
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static int[][] multiplyMatrices(int[][] a, int[][] b) {
//         int rowsA = a.length;
//         int colsA = a[0].length;
//         int colsB = b[0].length;

//         int[][] result = new int[rowsA][colsB];

//         for (int i = 0; i < rowsA; i++) {
//             for (int j = 0; j < colsB; j++) {
//                 for (int k = 0; k < colsA; k++) {
//                     result[i][j] += a[i][k] * b[k][j];
//                 }
//             }
//         }

//         return result;
//     }
// }



// multiply two matrices
// public class Matrices {
//     public static void main(String[] args) {
//         int[][] A = { {1, 2}, {3, 4} };
//         int[][] B = { {1, 2, 4}, {6, 8, 9} };

//         int[][] result = new int[2][3];

//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 3; j++) {
//                 for (int k = 0; k < 2; k++) {
//                     result[i][j] += A[i][k] * B[k][j];
//                 }
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }



// sparse matric code
// public class Matrices {
//     public static void main(String[] args) {
//         int[][] sparseMatrix = {
//                 {0, 0, 3,0, 4},
//                 {0, 0, 5,7, 0},
//                 {0, 0, 0,0, 0},
//                 {0, 2, 6, 0,0}
//         };

       
//         for (int i = 0; i < 4; i++) {
//             for (int j = 0; j < 5; j++) {
//                 if (sparseMatrix[i][j] != 0) {
//                     System.out.println("Element at (" + i + ", " + j + "): " + sparseMatrix[i][j]);
//                 }
//             }
//         }
//     }
// }


// transpose of a matrix
public class Matrices {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print
                        (transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}