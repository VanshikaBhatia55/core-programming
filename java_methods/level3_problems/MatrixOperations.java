package core_programming.java_methods.level3_problems;

import java.util.Random;

public class MatrixOperations {
    private static final Random random = new Random();

    // Method to create a random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Random integers between 0 and 9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static double[][] addMatrices(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition");
        }

        double[][] result = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static double[][] subtractMatrices(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for subtraction");
        }

        double[][] result = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static double[][] multiplyMatrices(double[][] matrix1, double[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            throw new IllegalArgumentException("Number of columns in first matrix must equal number of rows in second matrix");
        }

        double[][] result = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to find transpose of a matrix
    public static double[][] transposeMatrix(double[][] matrix) {
        double[][] result = new double[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Method to find determinant of a 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2");
        }
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find determinant of a 3x3 matrix
    public static double determinant3x3(double[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3");
        }

        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find inverse of a 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2");
        }

        double det = determinant2x2(matrix);
        if (det == 0) {
            throw new IllegalArgumentException("Matrix is not invertible");
        }

        double[][] result = new double[2][2];
        result[0][0] = matrix[1][1] / det;
        result[0][1] = -matrix[0][1] / det;
        result[1][0] = -matrix[1][0] / det;
        result[1][1] = matrix[0][0] / det;

        return result;
    }

    // Method to find inverse of a 3x3 matrix
    public static double[][] inverse3x3(double[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3");
        }

        double det = determinant3x3(matrix);
        if (det == 0) {
            throw new IllegalArgumentException("Matrix is not invertible");
        }

        double[][] cofactors = new double[3][3];

        // Calculate cofactors
        cofactors[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        cofactors[0][1] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        cofactors[0][2] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
        cofactors[1][0] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
        cofactors[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        cofactors[1][2] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);
        cofactors[2][0] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        cofactors[2][1] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
        cofactors[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        // Adjugate (transpose of cofactors)
        double[][] adjugate = transposeMatrix(cofactors);

        // Multiply by 1/determinant
        double[][] result = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = adjugate[i][j] / det;
            }
        }

        return result;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix, String name) {
        System.out.println("\n" + name + ":");
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.printf("%8.2f", element);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
            // Create random matrices
            double[][] matrix1_2x2 = createRandomMatrix(2, 2);
            double[][] matrix2_2x2 = createRandomMatrix(2, 2);
            double[][] matrix1_3x3 = createRandomMatrix(3, 3);
            double[][] matrix2_3x3 = createRandomMatrix(3, 3);

            // Display original matrices
            displayMatrix(matrix1_2x2, "2x2 Matrix 1");
            displayMatrix(matrix2_2x2, "2x2 Matrix 2");
            displayMatrix(matrix1_3x3, "3x3 Matrix 1");
            displayMatrix(matrix2_3x3, "3x3 Matrix 2");

            // Test addition
            double[][] additionResult = addMatrices(matrix1_2x2, matrix2_2x2);
            displayMatrix(additionResult, "Addition Result (2x2)");

            // Test subtraction
            double[][] subtractionResult = subtractMatrices(matrix1_2x2, matrix2_2x2);
            displayMatrix(subtractionResult, "Subtraction Result (2x2)");

            // Test multiplication
            double[][] multiplicationResult = multiplyMatrices(matrix1_2x2, matrix2_2x2);
            displayMatrix(multiplicationResult, "Multiplication Result (2x2)");

            // Test transpose
            double[][] transposeResult = transposeMatrix(matrix1_2x2);
            displayMatrix(transposeResult, "Transpose Result (2x2)");

            // Test determinants
            double det2x2 = determinant2x2(matrix1_2x2);
            System.out.printf("\nDeterminant of 2x2 Matrix 1: %.2f%n", det2x2);

            double det3x3 = determinant3x3(matrix1_3x3);
            System.out.printf("Determinant of 3x3 Matrix 1: %.2f%n", det3x3);

            // Test inverses
            double[][] inverse2x2 = inverse2x2(matrix1_2x2);
            displayMatrix(inverse2x2, "Inverse Result (2x2)");

            double[][] inverse3x3 = inverse3x3(matrix1_3x3);
            displayMatrix(inverse3x3, "Inverse Result (3x3)");

    }
}