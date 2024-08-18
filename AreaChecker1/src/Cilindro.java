public class Cilindro implements AreaChecker {
    private double base;
    private double raio;
    private double altura;

    public Cilindro(double base, double raio, double altura) {
        this.base = base;
        this.raio = raio;
        this.altura = altura;
    }

    @Override
    public double checkArea() {
        double x = raio+altura;
        double t = 2*3.14*raio*x;
        return t;
    }
}
