public class Retangulo implements AreaChecker {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double checkArea() {
        return base*altura;
    }
}
