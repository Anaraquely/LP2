public class Circulo implements AreaChecker {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double checkArea() {
        double a = raio*3.14;
        return Math.pow(a, 2);
    }
}