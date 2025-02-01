public abstract class AbstractIntegralsCulc {
    protected double a;
    protected double b;
    protected Function function;

    public AbstractIntegralsCulc(double a, double b, Function function) {
        this.a = a;
        this.b = b;
        this.function = function;
    }

    public abstract double get();
}
