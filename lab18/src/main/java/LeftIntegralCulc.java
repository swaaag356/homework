public class LeftIntegralCulc extends AbstractIntegralsCulc {
    private static final int N = 1000;

    public LeftIntegralCulc (double a, double b, Function f) {
        super(a,b,f);
    }

    @Override
    public double get() {
        double s = 0;
        double h = (b - a) / N;

        for (int i = 0; i < N; ++i) {
            s += h * function.calculate(a + h * i);
        }

        return s;
    }

}
