public class Paralelograma implements AreaChecker {
    private double base;
    private double altura;

    public Paralelograma(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double checkArea() {
        return base*altura;
    }
}
