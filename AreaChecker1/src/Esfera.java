public class Esfera implements AreaChecker {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double checkArea() {
        double r = Math.pow(raio,2);
        return 4*3.14*r;
    }
}
