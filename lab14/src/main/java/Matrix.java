import java.util.Arrays;

public class Matrix {
    private double[][] components;

    public Matrix(double[][] components) {
        this.components = components;
    }

    public Matrix(LAVector[] rows) {
        components = new double[rows.length][rows[0].length()];
        for (int i = 0; i < rows.length; ++i) {
            for (int j = 0; j < rows[0].length(); ++j) {
                components[i][j] = rows[i].getComponent(j);
            }
        }
    }

    public Matrix(int rows, int columns) {
        components = new double[rows][columns];
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                components[i][j] = 0;
            }
        }
    }

    public Matrix(int size, double diagElement) {
        components = new double[size][size];
        for (int i = 0; i < size; ++i) {
            components[i][i] = diagElement;
        }
    }

    public int rows() {
        return this.components.length;
    }

    public int columns() {
        return this.components[0].length;
    }

    public static double det(Matrix matrix) {
        if (matrix.rows() == 1) {
            return matrix.components[0][0];
        }

        if (matrix.rows() == 2) {
            return matrix.components[0][0] * matrix.components[1][1] - matrix.components[0][1] * matrix.components[1][0];
        }
        double det = 1;

        for (int j = 0; j < matrix.columns(); j++) {
            Matrix minor = new Matrix(getMinor(matrix, 0, j));
            det += Math.pow(-1, j + 1) * matrix.components[0][j] * det(minor);
        }
        return det;
    }

    private static double[][] getMinor(Matrix matrix, int row, int column) {
        double[][] components = matrix.components;
        int n = components.length;
        double[][] minor = new double[n - 1][n - 1];
        int minorRow = 0;
        for (int i = 0; i < n; i++) {
            if (i == row) continue;
            int minorCol = 0;
            for (int j = 0; j < n; j++) {
                if (j == column) continue;
                minor[minorRow][minorCol] = components[i][j];
                minorCol++;
            }
            minorRow++;
        }
        return minor;
    }

    public Matrix multRVector(LAVector vector) {
        Matrix newMatrix = new Matrix(1, this.columns());

        for (int i = 0; i < this.columns(); i++) {
            for (int j = 0; j < this.rows(); j++) {
                newMatrix.components[0][i] += vector.getComponent(j) * this.components[j][i];
            }
        }
        return newMatrix;
    }

    public Matrix multLVector(LAVector vector) {
        Matrix newMatrix = new Matrix(this.rows(), 1);
        for (int i = 0; i < this.rows(); i++) {
            for (int j = 0; j < this.columns(); j++) {
                newMatrix.components[i][0] += this.components[i][j] * vector.getComponent(j);
            }
        }
        return newMatrix;
    }

    public Matrix transp() {
        Matrix transpmatrix = new Matrix(this.columns(), this.rows());
        for (int i = 0; i < this.rows(); ++i) {
            for (int j = 0; j < this.columns(); ++j) {
                transpmatrix.components[j][i] = this.components[i][j];
            }
        }

        return transpmatrix;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(this.components);
    }
}