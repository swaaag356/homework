public class MainTest {
    public static void main(String[] args) {
        LAVector vec1 = new LAVector(new double[]{4.0, 6.0});
        LAVector vec2 = new LAVector(new double[]{4.0, 5.0});
        LAVector[][] mat = {{vec1, vec2}, {vec2, vec1}};
        Matrix matrix1 = new Matrix(mat[0]);
        Matrix matrix2 = new Matrix(mat[1]);

        System.out.println(Matrix.det(matrix1));
        System.out.println(Matrix.det(matrix2));
        System.out.println(matrix1.transp().toString());
    }
}
