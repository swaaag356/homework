public class LAVector {

    private double[] components;

    public LAVector(int size) {
        this.components = new double[size];
    }

    public LAVector(double[] components) {
        this.components = components;
    }

    public LAVector(int size, double value) {
        this.components = new double[size];

        for (int i = 0; i < size; ++i) {
            this.components[i] = value;
        }
    }

    public LAVector plusVector(LAVector other) {
        if (getSize(this) == getSize(other)) {
            for (int i = 0; i < getSize(this); ++i) {
                this.components[i] += other.components[i];
            }
        }
        return this;
    }

    public LAVector multNumber(double number) {
        for (int i = 0; i < getSize(this); ++i) {
            this.components[i] *= number;
        }
        return this;
    }

    public double scalarMult(LAVector other) {
        double result = 0;
        if (getSize(this) == getSize(other)) {
            for (int i = 0; i < getSize(this); ++i) {
                result = this.components[i] * other.components[i];
            }
        }
        return result;
    }

    public double abs() {
        double res = 0;
        for (int i = 0; i < components.length; i++) {
            res += components[i] * components[i];
        }
        return Math.sqrt(res);
    }

    public double getComponent(int n) {
        return this.components[n];
    }

    public int length() {
        return this.components.length;
    }

    public int getSize(LAVector vector) {
        return vector.components.length;
    }

    public String toString() {
        return "";
    }
}
