public class Triangulo implements AreaChecker {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double checkArea() {
        return base*altura/2;
    }
}
