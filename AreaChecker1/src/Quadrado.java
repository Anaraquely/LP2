public class Quadrado implements AreaChecker {
    private double lado;

    public Quadrado(double lado) {

        this.lado = lado;
    }

    @Override
    public double checkArea() {

        return lado * lado;
    }
}
